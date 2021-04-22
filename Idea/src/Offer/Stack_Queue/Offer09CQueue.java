/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer09CQueue
 * Author:   CS
 * Date:     2021/4/21 17:11
 * Description: 用两个栈实现队列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用两个栈实现队列〉
 *
 * @author CS
 * @create 2021/4/21
 * @since 1.0.0
 */
public class Offer09CQueue {

    Deque<Integer> stackIn;
    Deque<Integer> stackOut;

    public Offer09CQueue() {
        stackIn = new ArrayDeque<>();
        stackOut = new ArrayDeque<>();
    }

    public void appendTail ( int value ) {
        stackIn.offer(value);
    }

    public int deleteHead () {
        if ( stackOut.isEmpty() ) {
            inToOut();
        }
        if ( stackOut.isEmpty() ) {
            return -1;
        }
        return stackOut.pop();
    }

    public void inToOut( ) {
        while (!stackIn.isEmpty()) {
            stackOut.offer(stackIn.pollLast());
        }
    }

    public static void main(String[] args) {

    }
}
