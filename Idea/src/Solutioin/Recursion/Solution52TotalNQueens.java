/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution52TotalNQueens
 * Author:   CS
 * Date:     2021/4/13 22:18
 * Description: N皇后||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Recursion;

import java.util.HashSet;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br> 
 * 〈N皇后||〉
 *
 * @author CS
 * @create 2021/4/13
 * @since 1.0.0
 */
public class Solution52TotalNQueens {

    public int totalNQueens ( int n ) {
        Set<Integer> columns = new HashSet<>();
        Set<Integer> diagonals1 = new HashSet<>();
        Set<Integer> diagonals2 = new HashSet<>();
        return recursion(0 , columns , diagonals1 , diagonals2 , n );
    }

    public int recursion ( int row , Set<Integer>columns , Set<Integer>diagonals1 , Set<Integer>diagonals2 , int n ) {
        if ( row == n ) {
            return 1;
        }
        int count = 0;
        for ( int i = 0 ; i < n ; i++ ) {
            if ( columns.contains(i) ) {
                continue;
            }
            int diagonal1 = row + i;
            if ( diagonals1.contains(diagonal1) ) {
                continue;
            }
            int diagonal2 = row - i;
            if ( diagonals2.contains( diagonal2 ) ) {
                continue;
            }
            columns.add(i);
            diagonals1.add( row + i );
            diagonals2.add( row - i );
            count += recursion( row + 1 , columns , diagonals1 , diagonals2 , n );
            columns.remove(i);
            diagonals1.remove(row + i);
            diagonals2.remove(row - i);
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
