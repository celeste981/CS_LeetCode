/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution47PermuteUnique
 * Author:   CS
 * Date:     2021/4/1 10:06
 * Description: 全排列||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DepthFirstSearch;

import java.util.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈全排列||〉
 *
 * @author CS
 * @create 2021/4/1
 * @since 1.0.0
 */
public class Solution47PermuteUnique {

    public List<List<Integer>> permuteUnique ( int[] nums ) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        boolean[] visited = new boolean[ nums.length ];
        Arrays.sort(nums);
        dfs( nums , ans , path , visited );
        return ans;
    }

    public void dfs ( int[] nums , List<List<Integer>> ans , Deque<Integer> path , boolean[] visited ) {
        if ( path.size() == nums.length ){
            ans.add( new ArrayList<>( path ) );
        }
        for ( int i = 0 ; i < nums.length ; i++ ) {
            if ( i > 0 && nums[i] == nums[i-1] && !visited[i-1] ) {
                continue;
            }
            if ( !visited[i] ) {
                path.add(nums[i]);
                visited[i] = true;
                dfs(nums , ans , path , visited );
                visited[i] = false;
                path.removeLast();
            }
        }
    }

    public static void main(String[] args) {

    }
}
