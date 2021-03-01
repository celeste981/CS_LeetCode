/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n < 2){
            return s;
        }
        int start = 0 , max = 1;
        //1.初始化dp
        //2.状态转移
        boolean[][] dp = new boolean[n][n];
            //1.初始化：单个字符的状态都置为true
        for(int i = 0 ; i < n ; i++){
            dp[i][i] = true;
        }
            //2.状态转移，要保证dp[i+1][j-1]有值，那么j-1 >= i+1 ，j - i >= 2
            //字符i != j , 直接置为false
            //相等且dp[i+1][j-1]有值  状态转移
        for(int j = 1 ; j < n ; j++){
            for(int i = 0 ; i < j ; i++){
                if(s.charAt(i) != s.charAt(j)){
                    dp[i][j] = false;
                }
                else{
                    if(j - i < 2){
                        dp[i][j] = true;
                    }
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
        return s.substring(start, start + max);
    }
}
// @lc code=end

