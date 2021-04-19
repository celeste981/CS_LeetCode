/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: ClimbStairs
 * Author:   CS
 * Date:     2021/3/25 9:07
 * Description: 爬楼梯
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DepthFirstSearch.Recursion;

/**
 * 〈一句话功能简述〉<br> 
 * 〈爬楼梯〉
 *
 * @author CS
 * @create 2021/3/25
 * @since 1.0.0
 */
public class ClimbStairs {

    public int climbStairs ( int n ){
        if ( n == 1 ) {
            return n;
        }
        int oneBef= 1 , twoBef = 1 , cur = 0;
        for ( int i = 2 ; i <= n ; i++ ) {
            cur = oneBef + twoBef ;
            twoBef = oneBef;
            oneBef = cur;
        }
        return cur;
    }

    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
    }
}
