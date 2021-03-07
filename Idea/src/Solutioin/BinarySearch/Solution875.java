/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution875
 * Author:   Administrator
 * Date:     2021/3/6 10:57
 * Description: 爱吃香蕉的珂珂
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinarySearch;

/**
 * 〈一句话功能简述〉<br> 
 * 〈爱吃香蕉的珂珂〉
 *
 * @author Administrator
 * @create 2021/3/6
 * @since 1.0.0
 */
public class Solution875 {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1 , right = 1;
        for (int pile : piles) {
            if (pile > right){
                right = pile;
            }
        }
        while ( left <= right) {
            int mid = left + (right - left) / 2;
            if (check(piles , mid , h)){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean check (int[] piles , int m , int h) {
        int cnt = 0;
        for (int pile : piles ) {
            cnt += ( (pile - 1) / m ) + 1;
        }
        return cnt <= h;
    }

    public static void main(String[] args) {
        Solution875 solution875 = new Solution875();
        System.out.println(solution875.minEatingSpeed(new int[]{3,6,7,11} , 8));
    }
}
