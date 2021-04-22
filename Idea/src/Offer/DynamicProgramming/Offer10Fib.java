/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer10Fib
 * Author:   CS
 * Date:     2021/4/21 22:33
 * Description: 斐波那契数列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.DynamicProgramming;

/**
 * 〈一句话功能简述〉<br> 
 * 〈斐波那契数列〉
 *
 * @author CS
 * @create 2021/4/21
 * @since 1.0.0
 */
public class Offer10Fib {

    public int fib ( int n ) {
        if ( n < 2 ) {
            return n;
        }
        int a = 0;
        int b = 1;
        for ( int i = 2 ; i <= n ; i++ ) {
            int cur = a + b;
            a = b;
            b = cur % 1000000007;
        }
        return b;
    }

    public static void main(String[] args) {
        Offer10Fib offer10Fib = new Offer10Fib();
        System.out.println(offer10Fib.fib(5));
    }
}
