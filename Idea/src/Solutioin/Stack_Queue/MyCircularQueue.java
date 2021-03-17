/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: MyCircularQueue
 * Author:   Administrator
 * Date:     2021/3/17 15:07
 * Description: 设计循环队列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

/**
 * 〈一句话功能简述〉<br> 
 * 〈设计循环队列〉
 *
 * @author Administrator
 * @create 2021/3/17
 * @since 1.0.0
 */
public class MyCircularQueue {

    private int[] data;
    private int front , tail;
    private int size;

    public MyCircularQueue ( int k ) {
        data = new int[k+1];
        front = 0;
        tail = 0;
        size = k;
    }

    public boolean enQueue(int value) {
        if ( isFull() ) {
            return false;
        } else {
            data[tail] = value;
            tail = (tail + 1) % data.length;
            return true;
        }
    }

    public boolean deQueue() {
        if ( isEmpty() ) {
            return false;
        } else {
            front = (front + 1) % data.length;
            return true;
        }
    }

    public int Front() {
        if ( isEmpty() ) {
            return -1;
        } else {
            return data[front];
        }
    }

    public int Rear() {
        if ( isEmpty() ) {
            return -1;
        } else {
            return data[ (tail - 1 + data.length) % data.length];
        }
    }

    public boolean isEmpty() {
        return front == tail;
    }

    public boolean isFull() {
        return front == (tail + 1) % data.length;
    }

    public static void main(String[] args) {

    }
}
