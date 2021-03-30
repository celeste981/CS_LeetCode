/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution70ClimbStairs
 * Author:   CS
 * Date:     2021/3/30 15:18
 * Description: 爬楼梯
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DynamicProgramming;

/**
 * 〈一句话功能简述〉<br> 
 * 〈爬楼梯〉
 *
 * @author CS
 * @create 2021/3/30
 * @since 1.0.0
 */
public class Solution70ClimbStairs {

    public int climbStairs ( int n ) {
        int a = 1 , b = 1;
        int temp = 0;
        for ( int i = 2 ; i <= n ; i++ ) {
            temp = a + b ;
            a = b;
            b = temp;
        }
        return temp;
    }

    public static void main(String[] args) {

    }

}
