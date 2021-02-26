/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution5
 * Author:   CS
 * Date:     2021/1/31 13:42
 * Description: 最长回文子串
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DynamicProgramming;

/**
 * 〈一句话功能简述〉<br> 
 * 〈最长回文子串〉
 *
 * @author CS
 * @create 2021/1/31
 * @since 1.0.0
 */
public class Solution5 {

    String longestPalindrome(String s){
        int n = s.length();
        if(n < 2){
            return s;
        }
        int max = 1;
        int start = 0;
        //1.状态定义
        //boolean dp[i][j]

        //2.初始化
        boolean[][] dp = new boolean[n][n];
        for(int i = 0 ; i < n ; i++){
            dp[i][i] = true;
        }

        //3.状态转移
        //填写规则：先一列列写，再一行行写
        //保证左下方单元格先计算
        for(int j = 1 ; j < n ; j++){
            for(int i = 0 ; i < j ; i++){
                //头位字符不相等，直接置为false
                if(s.charAt(i) != s.charAt(j)){
                    dp[i][j] = false;
                }
                else{//头尾相等
                    //去头尾不剩字符
                    if(1 == (j - i) ){
                        dp[i][j] = true;
                    }
                    //去头尾还有字符,执行状态转移
                    else{
                        dp[i][j] = dp[ i + 1 ][ j - 1 ];
                    }
                }
                if(dp[i][j] == true && (j - i + 1) > max){
                    max = j - i + 1;
                    start = i;
                }
            }
        }
        return s.substring(start , start + max);
    }

    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        System.out.println(solution.longestPalindrome("babad"));
    }
}
