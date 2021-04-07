/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution81
 * Author:   Administrator
 * Date:     2021/3/5 15:39
 * Description: 搜索旋转排序数组||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinarySearch;

/**
 * 〈一句话功能简述〉<br> 
 * 〈搜索旋转排序数组||〉
 *  有重复数字
 *
 * @author Administrator
 * @create 2021/3/5
 * @since 1.0.0
 */
public class Solution81Search {

//    public boolean search(int[] nums, int target) {
//        int left = 0 , right = nums.length - 1 ;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if ( target == nums[mid]) {
//                return true;
//            } else {
//                if ( nums[mid] == nums[right] ){
//                    right--;
//                    continue;
//                }
//                if (nums[mid] < nums[right]) {
//                    //右边有序
//                    if (nums[mid] <= target && target <= nums[right]) {
//                        left = mid + 1;
//                    } else {
//                        right = mid - 1;
//                    }
//                } else {
//                    //左边有序
//                    if (nums[left] <= target && target <= nums[mid]) {
//                        right = mid - 1;
//                    } else {
//                        left = mid + 1;
//                    }
//                }
//            }
//        }
//        return false;
//    }

    private boolean search ( int[] nums , int target ) {
        int left = 0 , right = nums.length - 1;
        while ( left <= right ) {
            int mid = (right - left) / 2 + left;
            if ( nums[mid] == target ) {
                return true;
            } else {
                if (nums[mid] == nums[right]) {
                    right--;
                    continue;
                } else if (nums[mid] < nums[right]) {
                    //右边有序
                    if (nums[mid] <= target && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    //左边有序
                    if (nums[left] <= target && target <= nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution81Search solution81 = new Solution81Search();
        //1,0,1,1,1      0
        //2,5,6,0,0,1,2     3
        //1,1,1,1,1,1,2,1,1      2
        //3,1              0
        System.out.println(solution81.search(new int[]{3,1} , 0));
    }
}
