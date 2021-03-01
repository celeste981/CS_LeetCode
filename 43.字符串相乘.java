/*
 * @lc app=leetcode.cn id=43 lang=java
 *
 * [43] 字符串相乘
 */
// @lc code=start

class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        String res = "0";

        //num2逐位与num1相乘
        for(int i = num2.length() - 1 ; i >= 0 ; i--){
            int carry = 0;
            //保存num2 第i位数字与 num1 相乘的结果
            StringBuilder temp = new StringBuilder();
            //补0
            for(int j = 0 ; j < num2.length() - 1 - i ; j++){
                temp.append(0);
            }
            //n2取到num2的第1位
            int n2 = num2.charAt(i) - '0';

            //num2 的第i位数字 n2 与 num1 相乘
            for(int j = num1.length() - 1 ; j >= 0 || carry != 0 ; j--){
                //如果有进位没处理完，要继续处理进位
                int n1 = j < 0 ? 0 : num1.charAt(j) - '0';
                int sum = n1 * n2 + carry;
                carry = sum / 10;
                temp.append(sum % 10);
            }
            //将当前结果与新计算的结果求和作为新结果
            res = addStrings(res , temp.reverse().toString());
        }
        return res;
    }

    /*
    对两个字符串数字进行相加，返回字符串形式的和
    */

    public String addStrings(String num1 , String num2){
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        for(int i = num1.length() - 1 , j = num2.length() - 1 ;
         i >= 0 || j >= 0 || carry != 0 ; i-- , j--){
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            int sum = x + y + carry;
            builder.append(sum % 10);
            carry = sum / 10 ;
        }
        return builder.reverse().toString();
    }

}



// @lc code=end

