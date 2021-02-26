/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1493
 * Author:   CS
 * Date:     2021/2/2 20:45
 * Description: 删掉一个元素以后全为 1 的最长子数组：请你在删掉元素的结果数组中，返回最长的且只包含 1 的非空子数组的长度。  如果不存在这样的子数组，请返回 0 。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.SlidingWindow;

/**
 * 〈一句话功能简述〉<br> 
 * 〈删掉一个元素以后全为 1 的最长子数组：
 * 请你在删掉元素的结果数组中，返回最长的且只包含 1 的非空子数组的长度。
 * 如果不存在这样的子数组，请返回 0 。〉
 *
 * @author CS
 * @create 2021/2/2
 * @since 1.0.0
 */
public class Solution1493 {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int right = 0 , left = 0 , sum = 0 , maxLen = 0;
        while(right < n){
            sum += nums[right];
            right++;
            while((right - left) > (sum + 1)){
                sum -= nums[left];
                left++;
            }
            maxLen = Math.max(maxLen , right - left);
        }
        ans = Math.max(maxLen - 1 , 0);
        return ans;
    }
    public static void main(String[] args) {
        Solution1493 solution1493 = new Solution1493();
        System.out.println(solution1493.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
    }
}
