///**
// * Copyright (C), 2016-2021, 华中科技大学
// * FileName: Solution60GetPermutation
// * Author:   CS
// * Date:     2021/4/2 11:01
// * Description: 排列序列
// * History:
// * <author>          <time>          <version>          <desc>
// * 作者姓名           修改时间           版本号              描述
// */
//package Solutioin.DepthFirstSearch;
//
///**
// * 〈一句话功能简述〉<br>
// * 〈排列序列〉
// *
// * @author CS
// * @create 2021/4/2
// * @since 1.0.0
// */
//public class Solution60GetPermutation {
//
//    private int[] factorial;
//    private boolean[] visited;
//
//    private void calculationFactorial ( int n ) {
//        factorial = new int[n + 1];
//        factorial[0] = 1;
//        for ( int i = 1 ; i < n ; i++ ) {
//            factorial[i] = factorial[i - 1] * i;
//        }
//    }
//
//    public String getPermutation ( int n , int k ) {
//        calculationFactorial( n );
//        visited = new boolean[n + 1];
//        StringBuilder path = new StringBuilder();
//        return path.toString();
//    }
//
//    private void dfs ( int n , int k , StringBuilder path ) {
//        if ( path.length() == n ) {
//            return ;
//        }
//        for ( int i = 1 ; i <= n ; i++ ) {
//            if ( !visited[i] ) {
//                int cnt = calculationFactorial(n - i);
//                path.append(i);
//            }
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
