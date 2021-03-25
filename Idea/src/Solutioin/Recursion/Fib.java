/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Fib
 * Author:   CS
 * Date:     2021/3/24 21:35
 * Description: 斐波那契数列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Recursion;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈斐波那契数列〉
 *
 * @author CS
 * @create 2021/3/24
 * @since 1.0.0
 */
public class Fib {

    HashMap<Integer , Integer > cache = new HashMap<>();

    public int fib ( int n ) {
        if ( cache.containsKey( n) ) {
            return cache.get(n);
        }
        if ( n < 2 ) {
            return n;
        }
        int result = 0;
        result = fib(n - 1 ) + fib( n - 2 );
        cache.put( n , result ) ;
        return result;
    }
}
