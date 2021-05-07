/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution740DeleteAndEarn
 * Author:   CS
 * Date:     2021/5/6 9:28
 * Description: 删除并获得点数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DynamicProgramming;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈删除并获得点数〉
 *
 * @author CS
 * @create 2021/5/6
 * @since 1.0.0
 */
public class Solution740DeleteAndEarn {

    public int deleteAndEarn(int[] nums) {
        int[] bucket = new int[10001];
        for (int num : nums) {
            bucket[num] += num;
        }
        return rob(bucket);
    }

    public int rob(int[] bucket) {
        int ans = 0;
//        int[] dp = new int[10001];
//        dp[0] = bucket[0];
//        dp[1] = Math.max(bucket[0], bucket[1]);
        int first = bucket[0];
        int second = Math.max(bucket[0], bucket[1]);
        for (int i = 2; i < 10001; i++) {
//            dp[i] = Math.max( bucket[i] + dp[i - 2], dp[i - 1]);
            int temp = second;
            second = Math.max(bucket[i] + first , second);
            first = temp;
        }
//        return dp[10000];
        return second;
    }

    public static void main(String[] args) {
        Solution740DeleteAndEarn solution740DeleteAndEarn = new Solution740DeleteAndEarn();
        int[] nums = new int[]{2,2,3,3,3,4};
        System.out.println(solution740DeleteAndEarn.deleteAndEarn(nums));
    }
}
