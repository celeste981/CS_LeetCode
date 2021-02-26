/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution12
 * Author:   CS
 * Date:     2021/2/4 17:47
 * Description: 整数转罗马数字：I             1 V             5 X             10 L             50 C             100 D             500 M             1000
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈整数转罗马数字：I             1
 *                V             5
 *                X             10
 *                L             50
 *                C             100
 *                D             500
 *                M             1000  〉
 *
 * @author CS
 * @create 2021/2/4
 * @since 1.0.0
 */
public class Solution12 {
    public String intToRoman(int num){
        StringBuilder ans = new StringBuilder();
        int[] values = new int[] {1000 , 900 , 500 , 400 , 100 , 90 , 50 , 40 , 10 , 9 , 5 , 4 , 1};
        String[] symbols = new String[]{ "M" , "CM" , "D" , "CD" , "C" , "XC" , "L" , "XL" , "X" , "IX" , "V" , "IV" ,"I"};
        for(int i = 0 ; i < values.length && num != 0 ; i++){
            while(num >= values[i]){
                num -= values[i];
                ans.append(symbols[i]);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        System.out.println(solution12.intToRoman(1994));
    }
}
