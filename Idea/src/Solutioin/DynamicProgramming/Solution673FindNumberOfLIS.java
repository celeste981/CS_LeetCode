/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution673FindNumberOfLIS
 * Author:   CS
 * Date:     2021/4/29 10:20
 * Description: 最长递增子序列的个数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DynamicProgramming;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈最长递增子序列的个数〉
 *
 * @author CS
 * @create 2021/4/29
 * @since 1.0.0
 */
public class Solution673FindNumberOfLIS {

//    public int findNumberOfLIS(int[] nums) {
//        int n = nums.length;
//        if (n <= 1) {
//            return n;
//        }
//        // 以 i 结尾的最长子序列的长度
//        // 以 i 结尾的子序列的个数
//        int[] lengths = new int[n];
//        int[] counts = new int[n];
//        Arrays.fill(counts, 1);
//        for (int j = 0; j < n; j++) {
//            for (int i = 0; i < j; i++) {
//                if (nums[i] < nums[j]) {
//                    if (lengths[i] >= lengths[j]) {
//                        lengths[j] = lengths[i] + 1;
//                        counts[j] = counts[i];
//                    }
//                }
//            }
//        }
//    }

    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;

        int[] dp = new int[n];
        int[] count = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);
        int maxLength = 0;

        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    if(dp[j] + 1 > dp[i]){
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    }else if(dp[j] + 1 == dp[i]){
                        count[i] += count[j];
                    }
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        int res = 0;
        for(int i = 0; i < n; i++){
            if(dp[i] == maxLength){
                res += count[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // 1,3,5,4,7
        int[] nums = new int[]{1,3,5,4,7};
        Solution673FindNumberOfLIS solution673FindNumberOfLIS = new Solution673FindNumberOfLIS();
        System.out.println(solution673FindNumberOfLIS.findNumberOfLIS(nums));
    }
}
