/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: MyPow
 * Author:   CS
 * Date:     2021/3/25 9:33
 * Description: Pow(x,n)
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DepthFirstSearch.Recursion;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Pow(x,n)〉
 *
 * @author CS
 * @create 2021/3/25
 * @since 1.0.0
 */
public class MyPow {

//    public double quickPow ( double x , int n ) {
//        if ( n == 0 ) {
//            return 1.0;
//        }
//        double y = quickPow( x , n / 2 ) ;
//        return n % 2 == 0 ? y * y : y * y * x ;
//    }

    public double quickPow ( double x , long n ) {
        double ans = 1.0;
        while ( n > 0 ) {
            if ( (n & 1) == 1 ) {
                ans *= x;
            }
            x *= x;
            n >>= 1;
        }
        return ans;
    }

    public double myPow ( double x , int n ) {
        long N = n;
        return n >= 0 ? quickPow ( x , N ) : 1.0 / quickPow( x, -N );
    }

//    public double quickPow ( double x , int n ) {
//        if ( n == 0 ) {
//            return 1.0;
//        }
//        double y = quickPow( x , n / 2 ) ;
//        return n % 2 == 0 ? y * y : y * y * x ;
//    }
//
//
//    public double myPow ( double x , int n ) {
//        return n >= 0 ? quickPow ( x , n ) : 1.0 / quickPow( x, n );
//    }

    public static void main(String[] args) {
        MyPow myPow = new MyPow();
        System.out.println( myPow.myPow(3 , 5 ));
//        System.out.println( Integer.MAX_VALUE + 1);
//        System.out.println(Integer.);
    }
}
