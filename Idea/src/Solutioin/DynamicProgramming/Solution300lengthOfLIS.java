/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution300lengthOfLIS
 * Author:   CS
 * Date:     2021/4/29 9:09
 * Description: 最长递增子序列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DynamicProgramming;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈最长递增子序列〉
 *
 * @author CS
 * @create 2021/4/29
 * @since 1.0.0
 */
public class Solution300lengthOfLIS {

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int lenMax = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            lenMax = Math.max(lenMax, dp[i]);
        }
        return lenMax;
    }

    public static void main(String[] args) {
        // 4,10,4,3,8,9
        int[] nums = new int[]{4,10,4,3,8,9};
        Solution300lengthOfLIS solution300lengthOfLIS = new Solution300lengthOfLIS();
        System.out.println(solution300lengthOfLIS.lengthOfLIS(nums));
    }
}
