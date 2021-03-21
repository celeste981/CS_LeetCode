/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: NumIslandsDFS
 * Author:   CS
 * Date:     2021/3/21 15:48
 * Description: 深度优先岛屿数量
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

/**
 * 〈一句话功能简述〉<br> 
 * 〈深度优先岛屿数量〉
 *
 * @author CS
 * @create 2021/3/21
 * @since 1.0.0
 */
public class NumIslandsDFS {

    public void dfs ( char[][] grid , int i , int j ) {
        int m = grid.length;
        int n = grid[0].length;

        if ( i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0' ) {
            return ;
        }
        grid[i][j] = '0';
        dfs(grid , i - 1 , j );
        dfs(grid , i + 1 , j );
        dfs(grid , i , j - 1 );
        dfs(grid , i , j + 1 );

    }

    public int numIslands(char[][] grid) {
        if ( grid == null || grid.length == 0 ) {
            return 0;
        }
        int ans = 0;
        int m = grid.length , n = grid[0].length;
        for ( int i = 0 ; i < m ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                if ( grid[i][j] == '1' ) {
                    ans++;
                    dfs(grid , i , j);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        NumIslandsDFS numIslandsDFS = new NumIslandsDFS();
        System.out.println(numIslandsDFS.numIslands(new char[][] {
                { '1' , '1' , '1' , '1' , '0' } ,
                { '1' , '1' , '0' , '1' , '0' } ,
                { '1' , '1' , '0' , '0' , '0' } ,
                { '0' , '0' , '0' , '0' , '0' }
        }));
    }
}
