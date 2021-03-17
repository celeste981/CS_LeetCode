/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution232
 * Author:   Administrator
 * Date:     2021/3/5 9:31
 * Description: 用栈实现队列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用栈实现队列〉
 *
 * @author Administrator
 * @create 2021/3/5
 * @since 1.0.0
 */
public class Solution232 {

    Stack<Integer> stackIn = new Stack<>();
    Stack<Integer> stackOut = new Stack<>();
    //Deque<Integer> que = new ArrayDeque<>();

    public Solution232() {}

    public  void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        if(stackOut.isEmpty()){
           inToOut();
        }
        return stackOut.pop();
    }

    public int peek() {
        if (stackOut.isEmpty()) {
            inToOut();
        }
//        System.out.println(stackOut.get(1));
//        System.out.println(stackOut.get(0));
        System.out.println(stackOut.peek());
        return stackOut.peek();

    }

    public boolean empty() {
//        if(stackIn.isEmpty() && stackOut.isEmpty()){
//            return true;
//        }
//        return false;
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    public void inToOut(){
        while(!stackIn.isEmpty()) {
            stackOut.push(stackIn.pop());
        }
    }

    public static void main(String[] args) {
        Solution232 solution232 = new Solution232();
        solution232.push(1);
        solution232.push(2);
        solution232.push(3);
        solution232.peek();
    }
}
