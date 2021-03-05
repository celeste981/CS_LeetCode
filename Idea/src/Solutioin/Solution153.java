/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution153
 * Author:   Administrator
 * Date:     2021/3/5 10:07
 * Description: 寻找旋转排序数组中的最小值
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈寻找旋转排序数组中的最小值〉
 *
 * @author Administrator
 * @create 2021/3/5
 * @since 1.0.0
 */
public class Solution153 {

//    public int findMin(int[] nums) {
//        int ans = nums[0];
//        for (int num : nums ) {
//            if(num < ans){
//                return num;
//            }
//        }
//        return ans;
//    }

    public int findMin(int[] nums) {
        int left = 0 , right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        Solution153 solution153 = new Solution153();
        System.out.println(solution153.findMin(new int[] { 3,4,5,1,2}));
    }
}
