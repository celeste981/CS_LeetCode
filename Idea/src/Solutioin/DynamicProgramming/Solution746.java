/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution746
 * Author:   CS
 * Date:     2021/3/11 16:37
 * Description: 使用最小花费爬楼梯
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DynamicProgramming;

import Solutioin.BinaryTree.Solution98;

/**
 * 〈一句话功能简述〉<br> 
 * 〈使用最小花费爬楼梯〉
 *
 * @author CS
 * @create 2021/3/11
 * @since 1.0.0
 */
public class Solution746 {

    public int minCostClimbingStairs(int[] cost) {
        int ans = 0;
        int pre = 0 , cur = 0;
        for (int i = 2 ; i <= cost.length ; i++) {
            ans = Math.min(pre + cost[i - 2] , cur + cost[i -1]);
            pre = cur;
            cur = ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution746 solution746 = new Solution746();
        System.out.println(solution746.minCostClimbingStairs(new int[]{ 10 , 15 , 20}));
    }
}
