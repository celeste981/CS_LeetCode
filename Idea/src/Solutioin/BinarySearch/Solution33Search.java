/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution33
 * Author:   Administrator
 * Date:     2021/3/5 14:34
 * Description: 搜索旋转排序数组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinarySearch;

/**
 * 〈一句话功能简述〉<br> 
 * 〈搜索旋转排序数组〉
 *  无重复数字
 * @author Administrator
 * @create 2021/3/5
 * @since 1.0.0
 */
public class Solution33Search {

    public int search(int[] nums, int target) {
        int left = 0 , right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            } else {
                if (nums[mid] <= nums[right]) {
                    //右边有顺序
                    if (target >= nums[mid] && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    //左边有顺序
                    if (target >= nums[left] && target <= nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            }
        }
        return -1;
    }

//    public int search(int[] nums, int target) {
//        int left = 0 , right = nums.length - 1;
//        while ( left <= right ) {
//            int mid = left + ( right - left ) / 2;
//            if ( nums[mid] == target ) {
//                return mid;
//            }
//            if ( nums[mid] < nums[right]) {
//                //右边有序
//                if ( nums[mid] <= target && target <= nums[right] ) {
//                    left = mid + 1;
//                } else {
//                    right = mid - 1;
//                }
//            } else {
//                //左边有序
//                if ( nums[left] <= target && target <= nums[mid] ) {
//                    right = mid - 1;
//                } else {
//                    left = mid + 1;
//                }
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        Solution33Search solution33 = new Solution33Search();
        System.out.println(solution33.search(new int[] {1,1,2,2,2,2,2,1} , 1));
    }
}
