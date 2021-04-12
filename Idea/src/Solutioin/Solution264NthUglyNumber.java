/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution264NthUglyNumber
 * Author:   CS
 * Date:     2021/4/11 9:56
 * Description: 丑数||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br> 
 * 〈丑数||〉
 *
 * @author CS
 * @create 2021/4/11
 * @since 1.0.0
 */
public class Solution264NthUglyNumber {

//    public boolean isUgly ( int n ) {
////        if ( n < 1 ) {
////            return false;
////        }
//        while ( n % 5 == 0 ) {
//            n /= 5;
//        }
//        while ( n % 3 == 0 ) {
//            n /= 3;
//        }
//        while ( n % 2 == 0 ) {
//            n /= 2;
//        }
//        return n == 1;
//    }
//
//    public int nthUglyNumber ( int n ) {
//        if ( n <= 6 ) {
//            return n;
//        }
//        int cnt = 6;
//        int cur = cnt + 1;
//        while ( cnt < n ) {
//            if ( isUgly( cur ) ) {
//                cnt++;
//            }
//            cur++;
//        }
//        return cur - 1;
//    }

    public int nthUglyNumber ( int n ) {
        //hashset存储丑数集合
        //最小堆每次移除当前的最小值
        int[] factors = { 2 , 3 , 5 };
        Set<Long> seen = new HashSet<>();
        PriorityQueue<Long> heap = new PriorityQueue<>();
        seen.add(1l);
        heap.offer(1l);
        int ugly = 0;
        for ( int i = 0 ; i < n ; i++ ) {
            long cur = heap.poll();
            ugly = (int) cur;
            for ( int factor : factors ) {
                long next = cur * factor;
                if ( seen.add(next) ) {
                    heap.offer(next);
                }
            }
        }
        return ugly;
    }

    public static void main(String[] args) {
        Solution264NthUglyNumber solution264NthUglyNumber = new Solution264NthUglyNumber();
        System.out.println(solution264NthUglyNumber.nthUglyNumber( 10 ));
    }
}
