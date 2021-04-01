/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1006Clumsy
 * Author:   CS
 * Date:     2021/4/1 8:39
 * Description: 笨阶乘
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈笨阶乘〉
 *
 * @author CS
 * @create 2021/4/1
 * @since 1.0.0
 */
public class Solution1006Clumsy {

    public int clumsy ( int N ) {
        int ans = 0;
        if ( N <= 2 ) {
            return N;
        }
        if ( N == 3 ) {
            return 6;
        }
        ans = N * ( N - 1 ) / ( N - 2) + N - 3;
        N -= 4;
        while ( N >= 4 ) {
            ans += ( -N * ( N - 1) / ( N - 2 ) + N - 3 );
            N -= 4;
        }
        return ans - clumsy(N) ;
    }

    public static void main(String[] args) {
        Solution1006Clumsy solution1006Clumsy = new Solution1006Clumsy();
        System.out.println( solution1006Clumsy.clumsy(10) );
    }

}
