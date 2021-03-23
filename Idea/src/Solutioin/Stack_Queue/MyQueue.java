/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: MyQueue
 * Author:   CS
 * Date:     2021/3/23 10:22
 * Description: 双栈模拟队列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈双栈模拟队列〉
 *
 * @author CS
 * @create 2021/3/23
 * @since 1.0.0
 */
public class MyQueue {

    Deque< Integer > stackIn ;
    Deque< Integer > stackOut ;

    /** Initialize your data structure here. */
    public MyQueue() {
        stackIn = new LinkedList<>();
        stackOut = new LinkedList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackIn.push( x );
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if ( stackOut.isEmpty() ) {
            while ( !stackIn.isEmpty() ) {
                stackOut.push( stackIn.pop() );
            }
        }
        return stackOut.pop();
    }

    /** Get the front element. */
    public int peek() {
        if ( stackIn.isEmpty() ) {
            while ( !stackOut.isEmpty() ) {
                stackIn.push( stackOut.pop() );
            }
        }
        return stackIn.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}
