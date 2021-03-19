/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: MinStack
 * Author:   Administrator
 * Date:     2021/3/19 9:13
 * Description: 最小栈
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈最小栈〉
 *
 * @author Administrator
 * @create 2021/3/19
 * @since 1.0.0
 */
public class MinStack {

    private Deque<Integer> data;
    private Deque<Integer> helper;

    public MinStack() {
        data = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public void push ( int val ) {
        data.push( val );
        if ( helper.isEmpty() || val <= helper.peek() ) {
            helper.push( val );
        }
    }

    public void pop() {
        int top = data.pop();
        if ( top == helper.peek() ) {
            helper.pop();
        }
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return helper.peek();
    }

}
