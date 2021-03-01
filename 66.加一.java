import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        //从最低位开始++,如果哪一位出现没有进位，直接返回
        //所有位为9时，直接长度加一，首位赋一，其余位默认为0
        for(int i = digits.length - 1 ; i >= 0 ; i--){
            digits[i]++;
            digits[i] = digits[i] % 10;
            if(digits[i] != 0){
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
// @lc code=end

