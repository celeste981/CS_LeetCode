/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution713NumSubarrayProductLessThanK
 * Author:   CS
 * Date:     2021/4/15 10:53
 * Description: 乘积小于K的子数组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.TwoPoints.SlidingWindow;

/**
 * 〈一句话功能简述〉<br> 
 * 〈乘积小于K的子数组〉
 *
 * @author CS
 * @create 2021/4/15
 * @since 1.0.0
 */
public class Solution713NumSubarrayProductLessThanK {
//    public int numSubarrayProductLessThanK ( int[] nums , int k ) {
//        int right = 0 , left = 0 , curPro = 1;
//        int count = 0;
//        while ( left < nums.length ) {
//            if ( right < nums.length ) {
//                curPro *= nums[right];
//                if ( curPro < k ) {
//                    count++;
//                    right++;
//                } else {
//                    curPro = 1;
//                    left++;
//                    right = left;
//                }
//            } else{
//                curPro = 1;
//                left++;
//                right = left;
//            }
//        }
//        return count;
//    }

    public int numSubarrayProductLessThanK ( int[] nums , int k ) {
        int count = 0;
        int left = 0 , right = 0;
        int curPro = 1;
        while ( right < nums.length ) {
            curPro *= nums[right];
//            if ( curPro < k ) {
//                count++;
//                right++;
//            }
            // right乘完要++，否则再次循环的时候，会再乘当前的right
            right++;
            while ( left < nums.length && curPro >= k ) {
                curPro /= nums[left];
                left++;
            }
            //如果当前窗口内方案可行，加上方案数
            count += (right - left);
        }
        return Math.max( 0 , count );
    }

    public static void main(String[] args) {
        Solution713NumSubarrayProductLessThanK solution713NumSubarrayProductLessThanK = new Solution713NumSubarrayProductLessThanK();
        // 10,5,2,6     100
        System.out.println(solution713NumSubarrayProductLessThanK.numSubarrayProductLessThanK( new int[]{10,5,2,6} ,100 ) );
    }
}
