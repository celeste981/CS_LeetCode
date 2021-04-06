/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution40CombinationSum2
 * Author:   CS
 * Date:     2021/4/1 17:50
 * Description: 组合的总和||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DepthFirstSearch;

import java.util.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈组合的总和||〉
 *
 * @author CS
 * @create 2021/4/1
 * @since 1.0.0
 */
public class Solution40CombinationSum2 {

    public List<List<Integer>>  combinationSum2 ( int[] candidates , int target ) {
        if ( candidates.length == 0 ) {
            return new ArrayList<>();
        }
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        System.out.println(" candidates的内容： " + Arrays.toString(candidates));
        dfs( candidates , target , 0 , ans , path );
        return ans;
    }

    public void dfs( int[] candidates , int target , int begin , List<List<Integer>> ans , Deque<Integer> path ) {
        if ( target == 0 ) {
            ans.add( new ArrayList<>( path ) );
            System.out.println( " 答案中加进了 " + path );
            return ;
        }
        for ( int i = begin ; i < candidates.length ; i++ ) {
            if ( ( target - candidates[i] ) < 0 ) {
                break;
            }
            //同层的选择中才判断去重·
            if ( i > begin && candidates[i] == candidates[i-1] ) {
                continue;
            }
            path.addLast(candidates[i]);
            System.out.println( " 回溯之前 => " + path + " 剩余 = " + (target - candidates[i]));

            dfs( candidates , target - candidates[i] , i + 1 , ans , path );

            path.removeLast();
            System.out.println( " 回溯之后 => " + path + " 剩余 = " + (target - candidates[i]));
        }
    }

    public static void main(String[] args) {
        Solution40CombinationSum2 solution40CombinationSum2 = new Solution40CombinationSum2();
        System.out.println(" 输出 => " + solution40CombinationSum2.combinationSum2(new int[]{2,5,2,2,1} , 5));
    }
}
