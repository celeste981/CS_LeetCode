/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution198Rob
 * Author:   CS
 * Date:     2021/4/15 9:28
 * Description: 打家劫舍
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DynamicProgramming;

/**
 * 〈一句话功能简述〉<br> 
 * 〈打家劫舍〉
 *
 * @author CS
 * @create 2021/4/15
 * @since 1.0.0
 */
public class Solution198Rob {

    public int rob ( int[] nums ) {
        if ( nums.length == 0 ) {
            return 0;
        }
        if ( nums.length == 1 ) {
            return nums[0];
        }
//        int[] dp = new int[nums.length + 1];
//        dp[0] = 0;
//        dp[1] = nums[0];
//        dp[2] = nums[1];
//        for ( int i = 3 ; i <= nums.length ; i++ ) {
//            int bef = Math.max( dp[i-2] , dp[i-3] );
//            dp[i] = nums[i - 1] + bef;
//        }
//        return Math.max( dp[nums.length] , dp[nums.length - 1] );
//        int a = 0 , b = nums[0] , c = nums[1];
//        for ( int i = 3 ; i <= nums.length ; i++ ) {
//            int cur = nums[i- 1] + Math.max( a , b );
//            a = b;
//            b = c;
//            c = cur;
//        }
//        return Math.max( b , c );
        int a = nums[0] , b = Math.max( nums[0] , nums[1] );
        for ( int i = 2 ; i < nums.length ; i++ ) {
            int cur = Math.max( nums[i] + a , b );
            a = b;
            b = cur;
        }
        return b;
    }

    public static void main(String[] args) {
        Solution198Rob solution198Rob = new Solution198Rob();
        //1,2,3,1
        //2,7,9,3,1
        System.out.println(solution198Rob.rob(new int[]{1,2,3,1}));
    }
}
