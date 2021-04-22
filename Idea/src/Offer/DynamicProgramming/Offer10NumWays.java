/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer10NumWays
 * Author:   CS
 * Date:     2021/4/21 23:10
 * Description: 青蛙跳台阶问题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.DynamicProgramming;

/**
 * 〈一句话功能简述〉<br> 
 * 〈青蛙跳台阶问题〉
 *
 * @author CS
 * @create 2021/4/21
 * @since 1.0.0
 */
public class Offer10NumWays {

    public int numWays ( int n ) {
        int a = 1 ;
        int b = 2;
        if ( n == 0 ) {
            return 1;
        }
        if ( n <= 2 ) {
            return n;
        }
        for ( int i = 3 ; i <= n ; i++ ) {
            int cur = a + b;
            a = b;
            b = cur % 1000000007;
        }
        return b;
    }

    public static void main(String[] args) {
        Offer10NumWays offer10NumWays = new Offer10NumWays();
        System.out.println(offer10NumWays.numWays(7));
    }
}
