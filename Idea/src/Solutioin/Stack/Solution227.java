/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution227
 * Author:   CS
 * Date:     2021/3/11 12:41
 * Description: 基本计算器||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基本计算器||〉
 *
 * @author CS
 * @create 2021/3/11
 * @since 1.0.0
 */
public class Solution227 {
//
//    //中缀表达式转后缀表达式
//
//    Deque<Character> nums;
//    Deque<Character> opts;
//
//    public int calculate (String s) {
//        nums = new LinkedList<>();
//        opts = new LinkedList<>();
//        infixToSuffix(s);
//        int ans = 0;
//        while (!nums.isEmpty()){
//
//        }
//        return ans;
//    }
//
//    public void infixToSuffix(String s) {
//        //StringBuilder sb = new StringBuilder();
//        HashMap<Character , Integer> map = new HashMap<>();
//        map.put('+' , 1);
//        map.put('-' , 1);
//        map.put('*' , 2);
//        map.put('/' , 2);
//        int i =  0 , n = s.length();
//        while (i < n) {
//            if (s.charAt(i) == ' ') {
//                i++;
//            } else if (Character.isDigit(s.charAt(i))) {
//                nums.addLast(s.charAt(i));
//                i++;
//            } else {
//                //操作符栈为空，或当前操作符优先级大于栈顶时入栈
//                if (opts.isEmpty() || map.get(s.charAt(i)) > map.get(opts.peek())){
//                    opts.push(s.charAt(i));
//                    i++;
//                } else {
//                    //出栈入队，直到当前元素大于栈顶元素，或者栈空
//                    while (map.get(s.charAt(i)) <= map.get(opts.peek()) && !opts.isEmpty() ){
//                        nums.addLast(opts.pop());
//                    }
//                    i++;
//                }
//            }
//        }
//    }

    public int calculate(String s) {
//        int ans = 0;
        Deque<Integer> nums = new LinkedList<>();
        //nums.push(0);
        Deque<Character> opts = new LinkedList<>();
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('+' , 1);
        map.put('-' , 1);
        map.put('*' , 2);
        map.put('/' , 2);
        int i = 0 , n = s.length();
        while (i < n) {
            if (s.charAt(i) == ' ') {
                i++;
            } else if (Character.isDigit(s.charAt(i))) {
                int temp = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    temp = temp * 10 + s.charAt(i) - '0';
                    i++;
                }
                nums.push(temp);
            } else {
                //操作符栈为空，或当前操作符优先级大于栈顶时入栈
                while (!nums.isEmpty() && !opts.isEmpty() && map.get(s.charAt(i)) <= map.get(opts.peek())){
                    int opt2 = nums.pop();
                    int opt1 = nums.pop();
                    nums.push(calculate(opt1 , opt2 , opts.pop()));
                }
                opts.push(s.charAt(i));
                i++;
            }
        }
        while (!nums.isEmpty() && !opts.isEmpty()) {
            int opt2 = nums.pop();
            int opt1 = nums.pop();
            nums.push(calculate(opt1 , opt2 , opts.pop()));
        }
//        while (!nums.isEmpty()){
//            ans += nums.pop();
//        }
        return nums.pop();
    }

    public int calculate(int opt1 , int opt2 , char opt) {
        switch (opt) {
            case '-' : return opt1 - opt2;
            case '*' : return opt1 * opt2;
            case '/' : return opt1 / opt2;
            default : return opt1 + opt2;
        }
    }

    public static void main(String[] args) {
        Solution227 solution227 = new Solution227();
        System.out.println(solution227.calculate("1"));
    }
}
