/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: DecodeString
 * Author:   CS
 * Date:     2021/3/23 10:55
 * Description: 字符串解码
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 〈一句话功能简述〉<br> 
 * 〈字符串解码〉
 *
 * @author CS
 * @create 2021/3/23
 * @since 1.0.0
 */
public class DecodeString {

    public  String decodeString ( String s ) {
        int n = s.length();
        if ( n == 0 ) {
            return s;
        }
        StringBuilder ans = new StringBuilder();
        int tempMul = 0;

        for ( int i = 0 ; i < n ; i++ ) {
            if ( Character.isLetter( s.charAt(i) )) {
                ans.append( s.charAt(i) );
            } else if ( Character.isDigit( s.charAt(i) ) ) {
                while ( Character.isDigit( s.charAt(i) ) ) {
                    tempMul = tempMul * 10 + s.charAt(i) - '0';
                    i++;
                }
                i--;
            } else if ( s.charAt(i) == '[' ) {
                i++;
                int begin = i , end = 0;
                int count = 1;
                while ( count != 0 ) {
                    if ( s.charAt(i) == '[' ) {
                        count++;
                    } else if ( s.charAt(i) == ']' ) {
                        count--;
                    }
                    i++;
                }
                String curStr = decodeString( s.substring( begin , i ));
                while ( tempMul > 0 ) {
                    ans.append( curStr );
                    tempMul--;
                }
                i--;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        DecodeString decodeString = new DecodeString();
        System.out.println( decodeString.decodeString( "3[a]2[bc]" ) );
    }
}
