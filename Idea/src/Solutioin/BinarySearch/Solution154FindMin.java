/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution154
 * Author:   CS
 * Date:     2021/3/5 21:52
 * Description: 寻找旋转排序数组中的最小值||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinarySearch;

/**
 * 〈一句话功能简述〉<br> 
 * 〈寻找旋转排序数组中的最小值||〉
 *
 * @author CS
 * @create 2021/3/5
 * @since 1.0.0
 */
public class Solution154FindMin {


    public int findMin(int[] nums) {
        int left = 0 , right = nums.length - 1;
        while (left < right ) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == nums[right]){
                right--;
                continue;
            }
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        Solution154FindMin solution154 = new Solution154FindMin();
        System.out.println(solution154.findMin(new int[] {1,3,3}));
    }
}
