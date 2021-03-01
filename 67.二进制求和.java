/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder builder = new StringBuilder();
        for(int i = a.length() -1  , j = b.length() - 1 ;
        i >= 0 || j >= 0 || carry != 0 ; i-- , j--){
            int n1 = i < 0 ? 0 : a.charAt(i) - '0';
            int n2 = j < 0 ? 0 : b.charAt(j) - '0';
            int sum = n1 + n2 + carry;
            carry = sum / 2 ;
            builder.append(sum % 2);
        }
        return builder.reverse().toString();
    }
}
// @lc code=end

