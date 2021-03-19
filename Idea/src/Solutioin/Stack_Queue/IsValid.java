/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: IsValid
 * Author:   Administrator
 * Date:     2021/3/19 9:28
 * Description: 有效的括号
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈有效的括号〉
 *
 * @author Administrator
 * @create 2021/3/19
 * @since 1.0.0
 */
public class IsValid {

//    public boolean isValid ( String s ) {
//        if ( (s.length() ^ 1) == 1 ) {
//            return false;
//        }
//        HashMap< Character , Character > map = new HashMap<>();
////        map.put( '(' , ')');
//        map.put( ')' , '(');
////        map.put( '[' , ']');
//        map.put( ']' , '[');
////        map.put( '{' , '}');
//        map.put( '}' , '{');
//        Deque< Character > stack = new LinkedList<>();
//        for ( char c : s.toCharArray() ) {
//            if ( map.containsKey( c ) ) {
//                if ( stack.isEmpty() || stack.peek() != map.get( c ) ) {
//                    return false;
//                } else {
//                    stack.pop();
//                }
//            } else {
//                stack.push( c );
//            }
//        }
//        return stack.isEmpty();
//    }

    public boolean isValid ( String s ) {
        if ( (1 ^ s.length()) == 1) {
            return false;
        }
        Deque< Character > stack = new LinkedList<>();
        for ( char c : s.toCharArray() ) {
            if ( c == '(' ) {
                stack.push( ')' );
            } else if ( c == '{') {
                stack.push('}');
            } else if ( c == '[' ) {
                stack.push( ']' );
            } else if ( stack.isEmpty() || c != stack.pop() ) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        IsValid isValid = new IsValid();
        System.out.println(isValid.isValid( " ([)]"));
    }
}
