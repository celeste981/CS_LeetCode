/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: SolutionLCP12
 * Author:   Administrator
 * Date:     2021/3/2 9:59
 * Description: 小张刷题计划
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinarySearch;

import Solutioin.Solution6;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈小张刷题计划〉
 *
 * @author Administrator
 * @create 2021/3/2
 * @since 1.0.0
 */
public class SolutionLCP12 {

    public int minTime(int[] time, int m) {
        int ans = 0;
        //二分先确定左右边界
        //左边界最小为0
        //右边界最大为sum(time)
        //
        int left = 0 , right = 0;
        for (int t : time) {
            right += t;
        }
        while (left < right) {
            ans = ( right - left ) / 2 + left ;
            if(check(time , ans , m)) {
                right = ans;
            } else {
                left = ans + 1;
            }
        }
        return left;
    }

    public boolean check( int[] time , int mid , int m){
        int cnt = 1;
        int sum = 0;
        int max = 0;
        for (int t : time ) {
            if ( max < t ) {
                max = t;
            }
            if (sum + t - max > mid) {
                cnt++;
                max = t;
                sum = t;
            } else {
                sum += t;
            }
        }
        return cnt <= m;
    }

    public static void main(String[] args) {
        SolutionLCP12 solutionLCP12 = new SolutionLCP12();
        System.out.println(solutionLCP12.minTime(new int[]{1,2,3,3} , 2));
    }
}
