/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution150EvalRPN
 * Author:   CS
 * Date:     2021/3/20 20:45
 * Description: 逆波兰表达式求值
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈逆波兰表达式求值〉
 *
 * @author CS
 * @create 2021/3/20
 * @since 1.0.0
 */
public class Solution150EvalRPN {

    public int evalRPN(String[] tokens) {
//        int ans = 0;
        Deque< Integer > stack = new LinkedList<>();
        for ( String s : tokens ) {
            if ( "+-*/".contains(s) ) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch ( s ) {
                    case "*" : stack.push(num1 * num2); break;
                    case "/" : stack.push(num1 / num2); break;
                    case "-" : stack.push(num1 - num2); break;
                    default : stack.push( num1 + num2);
                }
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Solution150EvalRPN solution150EvalRPN = new Solution150EvalRPN();
        System.out.println(solution150EvalRPN.evalRPN(new String[]{ "2","1","+","3","*" }));
    }
}
