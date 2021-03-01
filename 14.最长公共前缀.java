/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count = strs.length;
        if(count == 0){
            return "";
        }
        int length = strs[0].length();
        for(int i = 0 ; i < length ; i++){
            char c = strs[0].charAt(i);
            for(int j = 1 ; j < count ; j++){
                if(strs[j].length() == i || strs[j].charAt(i) != c){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
// @lc code=end

