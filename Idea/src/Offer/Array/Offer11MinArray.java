/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer11MinArray
 * Author:   CS
 * Date:     2021/4/21 23:18
 * Description: 旋转数组的最小数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.Array;

/**
 * 〈一句话功能简述〉<br> 
 * 〈旋转数组的最小数字〉
 *
 * @author CS
 * @create 2021/4/21
 * @since 1.0.0
 */
public class Offer11MinArray {

    public int minArray ( int[] numbers ) {
        int left = 0 , right = numbers.length - 1;
        while ( left <= right ) {
            int mid = ( right - left ) / 2 + left;
            if ( numbers[mid] == numbers[right] ) {
                right--;
            } else if ( numbers[mid] < numbers[right] ) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return numbers[left];
    }

    public static void main(String[] args) {

    }
}
