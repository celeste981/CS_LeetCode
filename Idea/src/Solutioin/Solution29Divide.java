/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution29Divide
 * Author:   CS
 * Date:     2021/4/14 12:45
 * Description: 两数相除
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈两数相除〉
 *
 * @author CS
 * @create 2021/4/14
 * @since 1.0.0
 */
public class Solution29Divide {

    public int divide ( int dividend , int divisor ) {
        int flag = 1;
        if ( (dividend >= 0 && divisor <= 0) || (dividend <= 0 && divisor >= 0) ) {
            flag *= -1;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        return (flag) * ( dividend / divisor );
    }

    public static void main(String[] args) {
        Solution29Divide solution29Divide = new Solution29Divide();
        System.out.println(solution29Divide.divide(7 , -3));
    }
}
