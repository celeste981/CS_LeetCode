/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution263IsUgly
 * Author:   CS
 * Date:     2021/4/10 9:51
 * Description: 丑数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈丑数〉
 *
 * @author CS
 * @create 2021/4/10
 * @since 1.0.0
 */
public class Solution263IsUgly {

//    public boolean isUgly ( int n ) {
//        if ( n <= 0 ) {
//            return false;
//        }
//        for ( int i = 0 ; i < 3 ; i++ ) {
//            int mul = 1;
//            switch ( i ) {
//                case 0 : mul = 5;   break;
//                case 1 : mul = 3;   break;
//                case 2 : mul = 2;   break;
//                default: mul = 1;   break;
//            }
//            while ( n % mul == 0 ) {
//                n /= mul;
//            }
//        }
//        return n == 1;
//    }

    public boolean isUgly ( int n ) {
        if ( n <= 0 ) {
            return false;
        }
        while ( n % 5 == 0 ) {
            n /= 5;
        }
        while ( n % 3 == 0 ) {
            n /= 3;
        }
        while ( n % 2 == 0 ) {
            n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {

    }
}
