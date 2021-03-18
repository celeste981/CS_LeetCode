/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: NumSquares
 * Author:   Administrator
 * Date:     2021/3/18 15:19
 * Description: 完全平方数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈完全平方数〉
 *
 * @author Administrator
 * @create 2021/3/18
 * @since 1.0.0
 */
public class NumSquares {

    public int numSquares ( int n ) {
        int ans = 0;
        Deque<Integer> queue = new LinkedList<>();
        queue.offer( n );
        while ( !queue.isEmpty() ) {
            ans++;
            int size = queue.size();
            for ( int i = 0 ; i < size ; i++ ) {
                int temp = queue.poll();
                for ( int j = (int) Math.sqrt(temp) ; j >= 1 ; j-- ) {
                    if ( temp - (j*j) == 0 ) {
                        return ans;
                    } else {
                        queue.offer( temp - (j*j) );
                    }
                }
            }
        }
        return ans;
    }

    public boolean isSquares ( int n ) {
        int sq = (int) Math.sqrt( n );
        return n == sq * sq ;
    }

    public static void main(String[] args) {
        NumSquares numSquares = new NumSquares();
        System.out.println(numSquares.numSquares(7));
    }
}
