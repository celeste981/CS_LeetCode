/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution91NumDecodings
 * Author:   CS
 * Date:     2021/4/21 10:22
 * Description: 解码方法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈解码方法〉
 *
 * @author CS
 * @create 2021/4/21
 * @since 1.0.0
 */
public class Solution91NumDecodings {

    //如果字符串长度到一百的话，DFS的时间复杂度要到：2^100
    //远超计算机单秒运算量：10^7
    //不采用递归，考虑递推

    public int numDecodings ( String s ) {
        int n = s.length();
        //可以在字符串头部追加空格作为哨兵
        //追加空格避免讨论前导零，也可以使下标从1开始
        //简化f[i-1]等负数下标的判断
        s = " " + s;
        char[] cs = s.toCharArray();
        int[] f = new int[3];
        f[0] = 1;
        for ( int i = 1 ; i <= n ; i++ ) {
            //处理当前状态前，初始化为0
            f[i % 3] = 0;
            //a：代表【当前位置】单独形成item
            //b：代表【当前位置】与【前一位置】共同形成item
            int a = cs[i] - '0';
            int b = ( cs[i - 1] - '0' ) * 10 + cs[i] - '0';
            //如果a属于有效值，则f[i]可以由f[i-1]转移过来
            if ( 1 <= a && a <= 9 ) {
                f[i % 3] = f[(i - 1) % 3];
            }
            //如果b属于有效值，则f[i]可以由f[i-2]或者f[i-1] & f[i-2]转移过来
            if ( 10 <= b && b <= 26 ) {
                f[i % 3] += f[(i - 2) % 3];
            }
        }
        return f[n % 3];
    }

    public static void main(String[] args) {

    }
}
