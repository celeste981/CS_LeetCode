/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution403CanCross
 * Author:   CS
 * Date:     2021/4/29 8:39
 * Description: 青蛙过河
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DynamicProgramming;

/**
 * 〈一句话功能简述〉<br> 
 * 〈青蛙过河〉
 *
 * @author CS
 * @create 2021/4/29
 * @since 1.0.0
 */
public class Solution403CanCross {

    public boolean canCross(int[] stones) {
        int n = stones.length;
        // dp[i][k]
        // 青蛙能否达到【现在所处的石子编号】为 i 且【上一次跳跃距离】为 k
        boolean[][] dp = new boolean[n][n];
        dp[0][0] = true;
        for (int i = 1; i < n; i++) {
            if (stones[i] - stones[i - 1] > i) {
                return false;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                // k 为上一次跳跃距离
                int k = stones[i] - stones[j];
                if (k > j + 1) {
                    break;
                }
                dp[i][k] = dp[j][k - 1] || dp[j][k] || dp[j][k + 1];
                if (i == n - 1 && dp[i][k]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
