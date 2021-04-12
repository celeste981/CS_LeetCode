/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution287FindDuplicate
 * Author:   CS
 * Date:     2021/4/8 10:58
 * Description: 寻找重复数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinarySearch;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈寻找重复数〉
 *
 * @author CS
 * @create 2021/4/8
 * @since 1.0.0
 */
public class Solution287FindDuplicate {

//    public int findDuplicate ( int[] nums ) {
//
//        for ( int i = 0 ; i < nums.length ; i++ ) {
//            //如果不在正确的位置上就要换
//            while ( nums[i] != i ) {
//                //应当换去的位置已经有了这个数，说明重复了，return
//                if ( nums[i] == nums[ nums[i] ]) {
//                    return nums[i];
//                }
//                //可以交换
//                int temp = nums[i];
//                nums[i] = nums[temp];
//                nums[temp] = temp;
//            }
//        }
//
////        while ( nums[0] != 0 ) {
////            if ( nums[0] == nums[nums[0]] ) {
////                return nums[0];
////            }
////            int temp = nums[0];
////            nums[0] = nums[temp];
////            nums[temp] = temp;
////        }
//
//        return -1;
//    }

//    下述方式有误，因为可以存在多个有误的位置，但每次没有保证前面的数字都在正确的位置
//    可能刚好使重复的数字钻了空子，这样一数一格，就不会被找出来
    public int findDuplicate ( int[] nums ) {
        int ans ;
        System.out.println(Arrays.toString(nums));
        for ( int i = 0 ; i < nums.length ; i++ ) {
            int a = nums[i];
            int b = nums[nums[i] - 1];
            if ( nums[i] != nums[ nums[i] - 1 ] ) {
                int temp = nums[i];
                nums[i] = nums[ temp - 1 ];
                nums[ temp - 1 ] = temp;
            } else {
                if ( i != ( nums[i] - 1 ) ) {
                    ans = nums[i];
                    return ans;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return ans = -1;
    }

//    public int findDuplicate ( int[] nums ) {
//        int slow = 0, fast = 0;
//        do {
//            slow = nums[slow];
//            fast = nums[nums[fast]];
//        } while (slow != fast);
//        slow = 0;
//        while (slow != fast) {
//            slow = nums[slow];
//            fast = nums[fast];
//        }
//        return slow;
//    }

    public static void main(String[] args) {
        Solution287FindDuplicate solution287FindDuplicate = new Solution287FindDuplicate();
//        8,7,1,10,17,15,18,11,16,9,19,12,5,14,3,4,2,13,18,18
//        4,3,2,1,2,2
//        1,3,4,2,2
        int[] nums = new int[]{ 8,7,1,10,17,15,18,11,16,9,19,12,5,14,3,4,2,13,18,18 };
        System.out.println(solution287FindDuplicate.findDuplicate( nums ));
    }
}
