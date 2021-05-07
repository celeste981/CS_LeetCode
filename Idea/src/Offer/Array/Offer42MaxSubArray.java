/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer42MaxSubArray
 * Author:   CS
 * Date:     2021/4/22 15:46
 * Description: 连续子数组的最大和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.Array;

/**
 * 〈一句话功能简述〉<br>
 * 〈连续子数组的最大和〉
 *
 * @author CS
 * @create 2021/4/22
 * @since 1.0.0
 */
public class Offer42MaxSubArray {

    public int maxSubArray ( int[] nums ) {
        int sumMax = nums[0];
        int sumTemp = sumMax;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] > sumTemp + nums[i]) {
                // 判断条件可简化为 sumTemp < 0
                sumTemp = nums[i];
            } else {
                sumTemp += nums[i];
            }
            if (sumTemp > sumMax) {
                sumMax = sumTemp;
            }
        }
        return sumMax;
    }

    public static void main(String[] args) {
        Offer42MaxSubArray offer42MaxSubArray = new Offer42MaxSubArray();
        // -2,1,-3,4,-1,2,1,-5,4
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(offer42MaxSubArray.maxSubArray(nums));
    }
}
