/*
 * @lc app=leetcode.cn id=1370 lang=java
 *
 * [1370] 上升下降字符串
 */

// @lc code=start
class Solution {
    public String sortString(String s) {
        int[] num = new int[26];
        //1.把所有数据存到26个桶中去
        for(int i = 0 ; i < s.length() ; i++){
            num[s.charAt(i) - 'a']++;
        }
        //改变字符串 用Buffer或者Builder
        StringBuffer ret = new StringBuffer();
        while(ret.length() < s.length()){
            for(int i = 0 ; i < 26 ; i++){
                if(num[i] > 0){
                    ret.append((char)(i + 'a'));
                    num[i]--;
                }
            }
            for(int i = 25 ; i >= 0 ; i--){
                if(num[i] > 0){
                    ret.append((char)(i + 'a'));
                    num[i]--;
                }
            }
        }
        return ret.toString();
    }
}
// @lc code=end

