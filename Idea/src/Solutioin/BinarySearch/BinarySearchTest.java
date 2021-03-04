/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: BinarySearchTest
 * Author:   Administrator
 * Date:     2021/3/2 15:47
 * Description: 寻找左右边界的二分查找
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinarySearch;

/**
 * 〈一句话功能简述〉<br> 
 * 〈寻找左右边界的二分查找〉
 *
 * @author Administrator
 * @create 2021/3/2
 * @since 1.0.0
 */
public class BinarySearchTest {

    public int binarySearch(int[] nums , int target) {
        int left = 0 , right = nums.length;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int left_bound(int[] nums , int target) {
        int left = 0 , right = nums.length;
        while (left < right) {
            int mid = left + ( right - left) / 2;
            if (target == nums[mid]) {
                right = mid;
            } else if (target < nums[mid]) {
                right = mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            }
        }
        return left;
    }

    public int right_bound(int[] nums , int target) {
        int left = 0 , right = nums.length - 1;
        while (left <= right) {
            int mid = left + ( right - left) / 2;
            if (target == nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        BinarySearchTest binarySearchTest = new BinarySearchTest();
        System.out.println(binarySearchTest.binarySearch(new int[]{1,2,2,4} , 2));
        System.out.println(binarySearchTest.left_bound(new int[]{1,2,2,4} , 2));;
        System.out.println(binarySearchTest.right_bound(new int[]{1,2,2,4} , 2));;
    }
}
