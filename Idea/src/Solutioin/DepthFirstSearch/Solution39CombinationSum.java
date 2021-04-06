/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution39CombinationSum
 * Author:   CS
 * Date:     2021/4/1 10:51
 * Description: 组合总数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DepthFirstSearch;

import java.util.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈组合总和〉
 *
 * @author CS
 * @create 2021/4/1
 * @since 1.0.0
 */
public class Solution39CombinationSum {

    public List<List<Integer>> combinationSum ( int[] candidates , int target ) {
        if ( candidates.length == 0 ) {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        Deque<Integer> path = new ArrayDeque<>();
        dfs( candidates , 0 , target , path , ans );
        return ans;
    }

    public void dfs (int[] candidates , int begin , int target , Deque<Integer> path , List<List<Integer>> ans ) {
//        //target为负数时退出
//        if ( target < 0 ) {
//            return ;
//        }
        //target为0时输出
        if ( target == 0 ) {
            ans.add( new ArrayList<>( path ) );
            System.out.println( " 答案中加进了 " + path );
            return ;
        }
        for ( int i = begin ; i < candidates.length ; i++ ) {
            if ( target - candidates[i] < 0 ) {
                break;
            }
            path.addLast( candidates[i] );
            System.out.println(" 回溯之前 => " + path + " , 剩余 = " + (target - candidates[i]) );

            dfs( candidates , i , target - candidates[i] , path , ans );
            path.removeLast();

            System.out.println( " 回溯之后 => " + path );
        }
    }

    public static void main(String[] args) {
        Solution39CombinationSum solution39CombinationSum = new Solution39CombinationSum();
        System.out.println(" 输出 => " + solution39CombinationSum.combinationSum(new int[]{2,3,6,7} , 7) );
    }
}
