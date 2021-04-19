/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution643
 * Author:   CS
 * Date:     2021/2/4 12:21
 * Description: 子数组最大平均数 I：给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.TwoPoints.SlidingWindow;

/**
 * 〈一句话功能简述〉<br> 
 * 〈子数组最大平均数 I：给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。〉
 *
 * @author CS
 * @create 2021/2/4
 * @since 1.0.0
 */
public class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE , sum = 0 ;
        int right = 0;
        for (int i = 0 ; i < k && i < nums.length; i++){
            sum +=  nums[right++];
        }
        max = sum / k;
        while(right < nums.length){
            sum -= nums[right - k];
            sum += nums[right++];
            max = Math.max(max , sum / k);
        }
        return max;
    }
    public static void main(String[] args) {
        Solution643 solution643 = new Solution643();
        System.out.println(solution643.findMaxAverage(new int[]{1,12,-5,-6,50,3} , 4));
    }
}
