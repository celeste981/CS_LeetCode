/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: SolutionSearchInsert
 * Author:   CS
 * Date:     2021/4/7 15:37
 * Description: 搜索插入位置
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinarySearch;

/**
 * 〈一句话功能简述〉<br> 
 * 〈搜索插入位置〉
 *
 * @author CS
 * @create 2021/4/7
 * @since 1.0.0
 */
public class Solution35SearchInsert {

    public int searchInsert ( int[] nums , int target ) {
        int left = 0 , right = nums.length;
        while ( left < right ) {
            int mid = left + ( right - left ) / 2;
            if ( nums[mid] == target ) {
                return mid;
            } else if ( nums[mid] > target ) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if ( right == -1 ) {
            return 0;
        }
        return left;
    }

    public static void main(String[] args) {
        Solution35SearchInsert solutionSearchInsert = new Solution35SearchInsert();
        int[] nums = new int[]{1,3,5,6};
        System.out.println(solutionSearchInsert.searchInsert(nums , 0));
        System.out.println(solutionSearchInsert.searchInsert(nums , 2));
        System.out.println(solutionSearchInsert.searchInsert(nums , 5));
        System.out.println(solutionSearchInsert.searchInsert(nums , 7));
    }
}
