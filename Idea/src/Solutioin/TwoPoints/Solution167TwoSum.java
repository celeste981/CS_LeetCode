/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution167TwoSum
 * Author:   CS
 * Date:     2021/4/8 10:40
 * Description: 两数之和||-输入有序数组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.TwoPoints;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈两数之和||-输入有序数组〉
 *
 * @author CS
 * @create 2021/4/8
 * @since 1.0.0
 */
public class Solution167TwoSum {

    public int[] twoSum ( int[] numbers , int target ) {
        int left = 0 , right = numbers.length - 1;
        while ( left <= right ) {
            if ( (numbers[left] + numbers[right]) == target ) {
                return new int[]{ left + 1 , right + 1 };
            } else if ( (numbers[left] + numbers[right]) < target ) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{ -1 , -1 };
    }

    public static void main(String[] args) {
        Solution167TwoSum solution167TwoSum = new Solution167TwoSum();
        int[] nums = new int[]{ 2,7,11,15 };
        System.out.println(Arrays.toString(solution167TwoSum.twoSum( nums , 9 )));
    }
}
