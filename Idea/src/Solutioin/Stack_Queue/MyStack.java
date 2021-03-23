/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: MyStack
 * Author:   CS
 * Date:     2021/3/23 10:33
 * Description: 用队列实现栈
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用队列实现栈〉
 *
 * @author CS
 * @create 2021/3/23
 * @since 1.0.0
 */
public class MyStack {

    Deque< Integer > queue;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        int size = queue.size();
        queue.offer(x);
        for ( int i = 0 ; i < size ; i++ ) {
            queue.offer( queue.poll() );
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
