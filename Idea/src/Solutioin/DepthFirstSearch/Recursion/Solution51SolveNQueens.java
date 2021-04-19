/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution51SolveNQueen
 * Author:   CS
 * Date:     2021/4/13 9:47
 * Description: N皇后
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DepthFirstSearch.Recursion;

import java.util.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈N皇后〉
 *
 * @author CS
 * @create 2021/4/13
 * @since 1.0.0
 */
public class Solution51SolveNQueens {

    public List<List<String>> solveNQueens(int n ) {
        List<List<String>> ans = new ArrayList<>();
        int[] queens = new int[n];
        Arrays.fill(queens , -1);
        Set<Integer> columns = new HashSet<>();
        Set<Integer> diagonals1 = new HashSet<>();
        Set<Integer> diagonals2 = new HashSet<>();
        recursion( ans , queens , n , 0 , columns , diagonals1 , diagonals2);
        return ans;
    }

    public void recursion ( List<List<String>> ans , int[] queens , int n , int row , Set<Integer> columns ,
                            Set<Integer> diagonals1 , Set<Integer> diagonals2 ) {
        if ( row == n ) {
            List<String> cur = generateWay( queens , n );
            ans.add(cur);
            return ;
        }
        for ( int i = 0 ; i < n ; i++ ) {
            if ( columns.contains(i) ) {
                continue;
            }
            int diagonal1 = row + i;
            if ( diagonals1.contains(diagonal1) ) {
                continue;
            }
            int diagonal2 = row - i;
            if ( diagonals2.contains(diagonal2) ) {
                continue;
            }
            queens[row] = i;
            columns.add(i);
            diagonals1.add(row + i);
            diagonals2.add(row - i);
            recursion(ans, queens, n, row + 1, columns, diagonals1, diagonals2);
            queens[row] = -1;
            columns.remove(i);
            diagonals1.remove(row + i);
            diagonals2.remove(row - i);
        }
    }

    public List<String> generateWay ( int[] queens , int n ) {
        List<String> ans = new ArrayList<>();
        for ( int i = 0 ; i < n ; i++ ) {
            char[] row = new char[n];
            Arrays.fill(row , '.');
            row[queens[i]] = 'Q';
            ans.add(new String(row));
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
