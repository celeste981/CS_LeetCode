/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution115
 * Author:   Administrator
 * Date:     2021/3/17 9:45
 * Description: 不同的子序列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈不同的子序列〉
 *
 * @author Administrator
 * @create 2021/3/17
 * @since 1.0.0
 */
public class Solution115 {

    public int numDistinct ( String s , String t ) {
        int m = s.length() , n = t.length();
        int[] dp = new int[1005];
        dp[0] = 1;
        for ( int i = 1 ; i <= m ; i++ ) {
            for ( int j = n ; j >= 1 ; j-- ) {
                if ( s.charAt(i-1) == t.charAt(j-1) ) {
                    dp[j] += dp[j-1];
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {

    }
}
