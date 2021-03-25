/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution132Find132pattern
 * Author:   CS
 * Date:     2021/3/24 10:55
 * Description: 132模式
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈132模式〉
 *
 * @author CS
 * @create 2021/3/24
 * @since 1.0.0
 */
public class Solution132Find132pattern {

    public boolean find132pattern( int[] nums ) {
        int n = nums.length;
        if ( n < 3 ) {
            return false;
        }
        int[] min = new int[n];
        min[0] = nums[0];
        for ( int i = 1 ; i < n ; i++ ) {
            min[i] = Math.min( min[i - 1] , nums[i] ) ;
        }
        Deque< Integer > stack = new LinkedList<>();
        for ( int j = n - 1 ; j >= 0 ; j-- ) {
            if ( nums[j] > min[j] ) {
                while ( !stack.isEmpty() && stack.peek() <= min[j] ) {
                    stack.pop();
                }
                if ( !stack.isEmpty() && stack.peek() < nums[j] ) {
                    return true;
                }
                stack.push(nums[j]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution132Find132pattern solution132Find132pattern = new Solution132Find132pattern();
        System.out.println();
    }
}
