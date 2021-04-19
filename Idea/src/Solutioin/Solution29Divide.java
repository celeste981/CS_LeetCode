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
        if ( dividend == 0 ) {
            return 0;
        }
        if ( divisor == 1 ) {
            return dividend;
        }
        if ( divisor == -1 ) {
            if ( dividend == Integer.MIN_VALUE ) {
                return Integer.MAX_VALUE;
            } else {
                return dividend;
            }
        }
        int flag = 1;
        if ( (dividend >= 0 && divisor <= 0) || (dividend <= 0 && divisor >= 0) ) {
            flag *= -1;
        }
        //取绝对值的时候，dividend == Integer.MIN_VALUE，这里会出错
        dividend = Math.abs(dividend);
        System.out.println("取绝对值之后是：" + dividend );
        divisor = Math.abs(divisor);
        return (flag) * ( dividend / divisor );
    }

    public static void main(String[] args) {
        Solution29Divide solution29Divide = new Solution29Divide();
        System.out.println(solution29Divide.divide(-2147483648 , 2));
    }
}
