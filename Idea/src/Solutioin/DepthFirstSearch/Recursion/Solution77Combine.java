/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution77Combine
 * Author:   CS
 * Date:     2021/4/7 21:02
 * Description: 组合
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DepthFirstSearch.Recursion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈组合〉
 *
 * @author CS
 * @create 2021/4/7
 * @since 1.0.0
 */
public class Solution77Combine {

    public List<List<Integer>> combine ( int n , int k ) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        dfs( n , k , 1 , path , ans );
        return ans;
    }

    private void dfs ( int n , int k , int begin , Deque<Integer> path , List<List<Integer>> ans ) {
        if ( path.size() == k ) {
            ans.add( new ArrayList<>( path ) );
            return ;
        }
        //遍历可能的搜索起点
        for ( int i = begin ; i <= n ; i++ ) {
            //向路径变量里添加一个数
            path.addLast(i);
            dfs( n , k , i + 1 , path , ans );
            path.removeLast();
        }
    }

    public static void main(String[] args) {

    }

}
