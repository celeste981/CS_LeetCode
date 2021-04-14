/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: SolutionRemoveElement
 * Author:   CS
 * Date:     2021/4/14 10:23
 * Description: 移除元素
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Array;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈移除元素〉
 *
 * @author CS
 * @create 2021/4/14
 * @since 1.0.0
 */
public class Solution27RemoveElement {

    public int removeElement ( int[] nums , int val ) {
        //用i遍历整个数组
        //用j装不算val的数组
        //j <= i
        int j = 0;
        for ( int num : nums ) {
            if ( num != val ) {
                nums[j] = num;
                j++;
            }
        }
        return j;
    }

//    public int removeElement ( int[] nums , int val) {
//        int left = 0 , right = nums.length - 1;
//        while ( left <= right ) {
//            if ( nums[left] == val ) {
//                while ( right >= 0 && nums[right] == val ) {
//                    right--;
//                }
//                if ( right >= 0 && right >= left ) {
//                    int tmp = nums[left];
//                    nums[left] = nums[right];
//                    nums[right] = tmp;
//                    right--;
//                }
//            }
//            left++;
//        }
//        return right + 1;
//    }

    public void Print ( int[] nums , int newLen ) {
        System.out.println( Arrays.toString( Arrays.copyOf(nums , newLen) ) );
    }

    public static void main(String[] args) {
        Solution27RemoveElement solution27RemoveElement = new Solution27RemoveElement();
        //0,1,2,2,3,0,4,2   2
        //3,2,2,3   3
        //4,5   5
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int res = solution27RemoveElement.removeElement(nums , 2);
        solution27RemoveElement.Print(nums , res);
    }
}
