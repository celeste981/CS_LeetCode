/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution34SearchRange
 * Author:   CS
 * Date:     2021/3/31 17:01
 * Description: 在排序数组中查找元素的第一个和最后一个位置
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinarySearch;

/**
 * 〈一句话功能简述〉<br> 
 * 〈在排序数组中查找元素的第一个和最后一个位置〉
 *
 * @author CS
 * @create 2021/3/31
 * @since 1.0.0
 */
public class Solution34SearchRange {

    public int[] searchRange ( int[] nums , int target ) {
        int[] ans = new int[] {-1 , -1};
        ans[0] = lowerBound( nums , target );
        ans[1] = upperBound( nums , target );
        return ans;
    }

    public int lowerBound ( int[] nums , int target ) {
        int left = 0 , right = nums.length - 1;
        while ( left <= right ) {
            int mid = ( right - left ) / 2 + left;
            if ( nums[mid] >= target ) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if ( left >= nums.length || nums[left] != target ) {
            return -1;
        }
        return left;
    }

    public int upperBound ( int[] nums , int target ) {
        int left = 0 , right = nums.length - 1;
        while ( left <= right ) {
            int mid = ( right - left ) / 2 + left;
            if ( nums[mid] > target ) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if ( right < 0 || nums[right] != target ) {
            return -1;
        }
        return right;
    }

    public static void main(String[] args) {

    }
}
