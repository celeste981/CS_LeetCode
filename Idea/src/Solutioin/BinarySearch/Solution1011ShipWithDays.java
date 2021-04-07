/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1011
 * Author:   Administrator
 * Date:     2021/3/6 11:23
 * Description: 在D天内送达包裹的能力
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinarySearch;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈在D天内送达包裹的能力〉
 *
 * @author Administrator
 * @create 2021/3/6
 * @since 1.0.0
 */
public class Solution1011ShipWithDays {

    public int shipWithinDays(int[] weights, int D) {
        int left = 0 , right = 0;
        for ( int weight : weights ) {
            if ( weight > left ) {
                left = weight;
            }
            right += weight;
        }
        while ( left <= right ) {
            int mid = left + ( right - left ) / 2;
            if ( check( weights , D , mid ) ) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean check( int[] weights , int D , int mid ) {
        int cnt = 1;
        int cur = 0;
        for ( int i = 0 ; i < weights.length ; i++ ) {
            if ( (mid - cur ) < weights[i] ) {
                cnt++;
                cur = weights[i];
            } else {
                cur += weights[i];
            }
        }
        return cnt <= D;
    }

    public static void main(String[] args) {
        Solution1011ShipWithDays solution1011 = new Solution1011ShipWithDays();
        //1,2,3,4,5,6,7,8,9,10     5
        //1,2,3,1,1    4
        System.out.println(solution1011.shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10} , 5));
    }
}
