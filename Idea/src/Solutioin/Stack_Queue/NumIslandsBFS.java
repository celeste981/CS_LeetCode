/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: NumIslands
 * Author:   Administrator
 * Date:     2021/3/17 15:31
 * Description: 岛屿的数量
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 〈一句话功能简述〉<br> 
 * 〈岛屿的数量〉
 *
 * @author Administrator
 * @create 2021/3/17
 * @since 1.0.0
 */
public class NumIslandsBFS {
    public int numIslands(char[][] grid) {
        if ( grid == null || grid.length == 0 ) {
            return 0;
        }
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        for ( int i = 0 ; i < m ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                if ( grid[i][j] == '1' ) {
                    ans++;
                    grid[i][j] = '0';
                    Deque<Integer> queue = new ArrayDeque<>();
                    queue.offer(i * n + j);
                    while ( !queue.isEmpty() ) {
                        int size = queue.size();
                        for ( int k = 0 ; k < size ; k++ ) {
                            int index = queue.poll();
                            int ii = index / n;
                            int jj = index % n;
                            //上
                            if ( (ii - 1) >= 0 && grid[ii-1][jj] == '1') {
                                queue.offer( (ii - 1) * n + jj);
                                grid[ii - 1][jj] = '0';
                            }
                            //下
                            if ( (ii + 1) < m && grid[ii+1][jj] == '1') {
                                queue.offer( (ii + 1) * n + jj );
                                grid[ii + 1][jj] = '0';
                            }
                            //左
                            if ( ( jj - 1 ) >= 0 && grid[ii][jj-1] == '1'){
                                queue.offer(ii * n + j - 1);
                                grid[ii][jj-1] = '0';
                            }
                            //右
                            if ( (jj + 1) < n && grid[ii][jj+1] == '1') {
                                queue.offer( ii * n + jj + 1);
                                grid[ii][jj+1] = '0';
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        NumIslandsBFS numIslandsBFS = new NumIslandsBFS();
        System.out.println(numIslandsBFS.numIslands(new char[][] {
                { '1' , '1' , '1' , '1' , '0' } ,
                { '1' , '1' , '0' , '1' , '0' } ,
                { '1' , '1' , '0' , '0' , '0' } ,
                { '0' , '0' , '0' , '0' , '0' }
        }));
    }

}
