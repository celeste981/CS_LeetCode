/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer03FindRepeatNumber
 * Author:   CS
 * Date:     2021/4/16 10:08
 * Description: 寻找数组中的重复数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.Array;

/**
 * 〈一句话功能简述〉<br> 
 * 〈寻找数组中的重复数字〉
 *
 * @author CS
 * @create 2021/4/16
 * @since 1.0.0
 */
public class Offer03FindRepeatNumber {

    public int findRepeatNumber ( int[] nums ) {
        for ( int i = 0 ; i < nums.length ; i++ ) {
            while ( nums[i] != i ) {
                int temp = nums[ nums[i] ];
                if ( nums[i] == temp ) {
                    return temp;
                } else {
                    nums[nums[i]] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        Offer03FindRepeatNumber offer03FindRepeatNumber = new Offer03FindRepeatNumber();
        //2,3,1,0,2,5,3
        int[] nums = new int[]{ 2,3,1,0,2,5,3 };
        System.out.println( offer03FindRepeatNumber.findRepeatNumber( nums ) );
    }
}
