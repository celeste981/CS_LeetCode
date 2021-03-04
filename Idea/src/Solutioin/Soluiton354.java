/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Soluiton354
 * Author:   Administrator
 * Date:     2021/3/4 9:30
 * Description: 俄罗斯套娃信封问题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 〈一句话功能简述〉<br> 
 * 〈俄罗斯套娃信封问题〉
 *
 * @author Administrator
 * @create 2021/3/4
 * @since 1.0.0
 */
public class Soluiton354 {

    public int maxEnvelopes(int[][] envelopes) {
        int ans = 0;
        //按宽度升序
        // 对于相同宽度，按高度降序
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //升序：o1 < o2
                //降序：o1 > o2
                /* 返回值 <=0 就不交换 ， >0 交换
                *  给出一个正确的情况即可
                *  如果不需要交换，需要返回负值
                *  则用当前顺序的小值减大值*/
                return o1[0] == o2[0] ?
                        o2[1] - o1[1] : o1[0] - o2[0];
            }
        });
        //对高度数组寻找LIS
        //创建高度数组
        int n = envelopes.length;
        int[] height = new int[n];
        for (int i = 0 ; i < n ; i++ ) {
            height[i] = envelopes[i][1];
        }
        ans = ILS(height);
        return ans;
    }

//    public int ILS(int[] nums) {
//        //dp
//        int ans = 1;
//        int n = nums.length;
//        if (n == 0 ) {
//            return 0;
//        }
//        int[] dp = new int[n];
//        Arrays.fill(dp , 1);
//        for (int i = 1 ; i < n ; i++ ) {
//            for (int j = 0 ; j < i ; j++ ) {
//                if (nums[i] > nums[j]) {
//                    dp[i] = Math.max( dp[i] , dp[j] + 1);
//                }
//            }
//            ans = Math.max( ans , dp[i]);
//        }
//        return ans;
//    }

    public int ILS( int[] nums) {
        int ans = 0;
        int n = nums.length;
        int[] top = new int[n];
        for (int i = 0 ; i < n ; i++ ) {
            int temp = nums[i];
            int left = 0 , right = ans;
            while(left < right) {
                int mid = left + (right - left) / 2;
                if (temp > top[mid]) {
                    left = mid + 1;
                } else if (temp < top[mid]) {
                    right = mid;
                } else {
                    right = mid;
                }
            }
            if(left == ans) {
                ans++;
            }
            top[left] = temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        Soluiton354 soluiton354 = new Soluiton354();
        System.out.println(soluiton354.maxEnvelopes(new int[][]{ {5,4} , {6,4} , {6,7} , {2,3}}));
    }
}
