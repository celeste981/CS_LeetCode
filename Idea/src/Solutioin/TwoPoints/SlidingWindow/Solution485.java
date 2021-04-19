/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution485
 * Author:   CS
 * Date:     2021/2/15 11:26
 * Description: 最大连续1的个数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.TwoPoints.SlidingWindow;

/**
 * 〈一句话功能简述〉<br> 
 * 〈最大连续1的个数〉
 *
 * @author CS
 * @create 2021/2/15
 * @since 1.0.0
 */
public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int n = nums.length , right = 0 , left =  0;
        while(right < n){
            if (nums[right] == 1){
                ans = Math.max( ans , right + 1 - left);
            }
            if(nums[right] == 0){
                while (nums[left] != 0 ){
                    left++;
                }
                left++;
            }
            right++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution485 solution485 = new Solution485();
        System.out.println(solution485.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }
}
