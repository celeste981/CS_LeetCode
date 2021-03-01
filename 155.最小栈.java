/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
//     //思路1：数据栈和辅助栈在任何时候都同步
// class MinStack {

//     //做一个辅助栈一个数据栈
//     //数据栈
//     private Stack<Integer> data;
//     //辅助栈
//     private Stack<Integer> helper;

//     /** initialize your data structure here. */

//     public MinStack() {
//         data = new Stack<>();
//         helper = new Stack<>();
//     }

    
//     public void push(int x) {
//         //数据栈和辅助栈都要增加元素
//         data.add(x);
//         if(helper.isEmpty() || helper.peek() >= x){
//             helper.add(x);
//         }
//         else{
//             helper.add(helper.peek());
//         }
//     }
    
//     public void pop() {
//         //数据栈和辅助栈都要弹出元素
//         if(!data.isEmpty()){
//             helper.pop();
//             data.pop();
//         }

//     }
    
//     public int top() {
//         //取栈顶元素用peek()方法
//         if(!data.isEmpty()){
//             return data.peek();
//         }
//         else{
//             throw new RuntimeException("栈中无元素，此操作非法！");
//         }

//     }
    
//     public int getMin() {
//         if(!helper.isEmpty()){
//             return helper.peek();
//         }
//         else{
//             throw new RuntimeException("栈中无元素，此操作非法！");
//         }
//     }
// }


//思路2：辅助栈和数据栈不同步
import java.util.Stack;

public class MinStack{

    //数据栈辅助栈声明
    private Stack<Integer> data;
    private Stack<Integer> helper;

    public MinStack() {
        data = new Stack<>();
        helper = new Stack<>();
    }


    //关键1：helper为空时，必须放入新进来的数
    /*关键2：新来的数小于或者等于辅助栈栈顶的元素的时候
            此时放入新进的数，特别注意：等于栈顶元素也
            要放入辅助栈*/
    /*关键3：出栈的时候，辅助栈的栈顶元素等于数据栈的栈
            顶元素，才出栈，“出栈保持同步”*/
    public void push(int x) {
        //辅助栈在关键1,2时push
        //数据栈data正常push  add()
        data.add(x);
        if(helper.isEmpty() || helper.peek() >= x){
            helper.add(x);
        }
    }

    public void pop() {
        //数据栈data正常pop()
        //关键3
        if(!data.isEmpty()){
            int top = data.pop();
            if(top == helper.peek()){
                helper.pop();
            }
        }

    }

    public int top() {
        if(!data.isEmpty()){
            return data.peek();
        }
        else{
            throw new RuntimeException("栈中无元素，此操作非法！");
        }
    }
    public int getMin() {
        if(!helper.isEmpty()){
            return helper.peek();
        }
        else{
            throw new RuntimeException("栈中无元素，此操作非法！");
        }
    }


}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

