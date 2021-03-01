/*
 * @lc app=leetcode.cn id=424 lang=java
 *
 * [424] 替换后的最长重复字符
 */

// @lc code=start
class Solution {
    public int characterReplacement(String s, int k) {
        //int ans;
        int n = s.length() , right = 0 , left = 0 , max = 0;
        int[] occ = new int[26];
        while(right < n){
            occ[s.charAt(right)-'A']++;
            max = Math.max(max, occ[s.charAt(right++) - 'A']);
            if(right - left > max + k){
                occ[s.charAt(left++) - 'A']--;
            }
        }
        return right - left;
    }
}
// @lc code=end

