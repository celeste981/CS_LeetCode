/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution80RemoveDuplicates
 * Author:   CS
 * Date:     2021/4/6 9:28
 * Description: 删除有序数组中的重复项|||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.TwoPoints;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈删除有序数组中的重复项|||〉
 *
 * @author CS
 * @create 2021/4/6
 * @since 1.0.0
 */
public class Solution80RemoveDuplicates {

//    private int removeDuplicates ( int[] nums ) {
//        int len = nums.length;
//        if ( len < 3 ) {
//            return len;
//        }
//        //两个指针
//        // j来遍历数组
//        // i存储结果
//        int i = 0 , j = 1 , count = 0;
//        while ( j < len ) {
//            if ( nums[j] == nums[i] ) {
//                count++;
//                if ( count == 1 ) {
//                    i++;
//                    nums[i] = nums[j];
//                }
//            } else {
//                count = 0;
//                i++;
//                nums[i] = nums[j];
//            }
//            j++;
//        }
//        return i + 1;
//    }

    private int removeDuplicates ( int[] nums ) {
        int len = nums.length;
        if ( len < 3 ) {
            return len;
        }
        int slow = 2 , fast = 2;
        while ( fast < len ) {
            if ( nums[slow - 2] != nums[fast] ) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    //允许最多K次出现
    private int removeKDuplicates ( int[] nums , int K ) {
        int len = nums.length;
        if ( len <= K ) {
            return len;
        }
        int slow = K , fast = K;
        while ( fast < len ) {
            if ( nums[ slow - K] != nums[fast] ) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        Solution80RemoveDuplicates solution80RemoveDuplicates = new Solution80RemoveDuplicates();
        int[] nums = new int[]{ 1,1,1,1,2,2,2,3};
        System.out.println("原数组是 => " + Arrays.toString(nums));
        System.out.println(solution80RemoveDuplicates.removeDuplicates(nums));
        System.out.println("允许存在2次出现的结果 => " + Arrays.toString(nums));

        nums = new int[]{ 1,1,1,1,2,2,2,3};
        System.out.println(solution80RemoveDuplicates.removeKDuplicates(nums , 3));
        System.out.println("允许存在K次出现的结果 => " + Arrays.toString(nums));
    }
}
