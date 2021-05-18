/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution13RomanToInt
 * Author:   Administrator
 * Date:     2021/5/17 12:09
 * Description: 罗马数字转整数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.String;

/**
 * 〈一句话功能简述〉<br> 
 * 〈罗马数字转整数〉
 *
 * @author Administrator
 * @create 2021/5/17
 * @since 1.0.0
 */
public class Solution13RomanToInt {

//    private int[] values = new int[] {1000 , 900 , 500 , 400 , 100 , 90 , 50 , 40 , 10 , 9 , 5 , 4 , 1};
//    private String[] symbols = new String[]{ "M" , "CM" , "D" , "CD" , "C" , "XC" , "L" , "XL" , "X" , "IX" , "V" , "IV" ,"I"};

    public int romanToInt(String s) {
        int ans = 0;
        int n = s.length();
        char[] cs = s.toCharArray();
        int preNum = getVal(cs[0]);
        for (int i = 1; i < n; i++) {
            int curNum = getVal(cs[i]);
            if (preNum < curNum) {
                ans -= preNum;
            } else {
                ans += preNum;
            }
            preNum = curNum;
        }
        ans += preNum;
        return ans;
    }

    public int getVal(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static void main(String[] args) {

    }
}
