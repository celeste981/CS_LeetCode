/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1TwoSum
 * Author:   CS
 * Date:     2021/4/16 9:34
 * Description: 两数之和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.TwoPoints;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈两数之和〉
 *
 * @author CS
 * @create 2021/4/16
 * @since 1.0.0
 */
public class Solution1TwoSum {

    public int[] twoSum ( int[] nums , int target ) {
        HashMap< Integer , Integer > idxMap = new HashMap<>();
        for ( int i = 0 ; i < nums.length ; i++ ) {
            if ( idxMap.containsKey( target - nums[i]) ) {
                return new int[]{ idxMap.get( target - nums[i] ) , i };
            } else {
                idxMap.put( nums[i] , i );
            }
        }
        return new int[]{ -1, -1 };
    }

//    //下面的方法需要数组有序
//    public int[] twoSum ( int[] nums , int target ) {
//        int left = 0 , right = nums.length - 1;
//        while ( left < right ) {
//            int curSum = nums[left] + nums[right];
//            if ( curSum == target ) {
//                return new int[]{ left , right };
//            }
//            if ( curSum < target ) {
//                left++;
//            }
//            if ( curSum > target ) {
//                right--;
//            }
//        }
//        return new int[]{ -1 , -1 };
//    }

    public static void main(String[] args) {
        Solution1TwoSum solution1TwoSum = new Solution1TwoSum();
        //3,2,4         6
        //2,7,11,15     9
        int[] nums = new int[]{ 3,2,4 };
        System.out.println( Arrays.toString( solution1TwoSum.twoSum( nums , 6 ) ) );
    }
}
