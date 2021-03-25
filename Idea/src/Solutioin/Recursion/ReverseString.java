/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: ReverseString
 * Author:   CS
 * Date:     2021/3/24 16:54
 * Description: 反转字符串
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Recursion;

/**
 * 〈一句话功能简述〉<br> 
 * 〈反转字符串〉
 *
 * @author CS
 * @create 2021/3/24
 * @since 1.0.0
 */
public class ReverseString {

    public void reverseString(char[] s) {
        int n = s.length;
//        for ( int left = 0 , right = n - 1 ; left < right ; left++ , right-- ) {
//            char temp = s[left];
//            s[left] = s[right];
//            s[right] = temp;
//        }
//        for ( int i = 0 ; i < n / 2 ; i++ ) {
//            char temp = s[i];
//            s[i] = s[n - 1 - i];
//            s[n - 1 - i] = temp;
//        }

        //递归
        helper(0 , n - 1 , s);
    }

    public void helper ( int start , int end , char[] s ) {
        if ( start >= end ) {
            return ;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        helper( start + 1 , end - 1 , s);
    }

    public static void main(String[] args) {

    }
}
