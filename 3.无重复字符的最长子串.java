import java.util.Set;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 * 
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        int start = 0, end = 0;
        for(start = 0 , end = 0 ; end < n ;){
            if(!occ.contains(s.charAt(end))){
                occ.add(s.charAt(end++));
                ans = Math.max(ans, end - start);
            }
            else{
                occ.remove(s.charAt(start++));
            }
        }
        return ans;
    }
}
// @lc code=end

