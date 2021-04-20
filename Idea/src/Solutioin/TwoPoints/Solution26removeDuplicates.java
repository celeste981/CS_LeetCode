/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution26removeDuplicates
 * Author:   CS
 * Date:     2021/4/6 9:36
 * Description: 删除有序数组中的重复项
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.TwoPoints;

/**
 * 〈一句话功能简述〉<br> 
 * 〈删除有序数组中的重复项〉
 *
 * @author CS
 * @create 2021/4/6
 * @since 1.0.0
 */
public class Solution26removeDuplicates {

    private int removeDuplicates ( int[] nums ) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }
        int i = 0, j = 1;
//        两个指针
//        指针i指向当前存储的元素，用i存储的每一个元素都不相同
//        用指针j来找每一个不同的元素。
        while (j < len) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }

//        int j = 0;
//        for ( int num : nums ) {
//
//        }
//        return j;
//    }

//    private int removeDuplicates ( int[] nums ) {
//        int len = nums.length;
//        if ( len < 2 ) {
//            return len;
//        }
//        int slow = 1 , fast = 1;
//        while ( fast < len ) {
//            if ( nums[ slow - 1 ] != nums[fast] ) {
//                nums[slow] = nums[fast];
//                slow++;
//            }
//            fast++;
//        }
//        return slow;
//    }

    public static void main(String[] args) {

    }
}
