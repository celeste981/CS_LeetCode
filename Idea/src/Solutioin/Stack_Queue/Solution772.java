/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution772
 * Author:   CS
 * Date:     2021/3/11 15:36
 * Description: 基本计算器|||
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
 * 〈基本计算器|||〉
 *
 * @author CS
 * @create 2021/3/11
 * @since 1.0.0
 */
public class Solution772 {

    Deque<Integer> nums;
    Deque<Character> opts;
    HashMap<Character , Integer> priority = new HashMap(){
        {
            priority.put('+' , 1);
            priority.put('-' , 1);
            priority.put('*' , 2);
            priority.put('/' , 2);
            priority.put('%' , 2);
        }
    };

    public int calculate (String s) {
        int ans = 0;
        nums = new LinkedList<>();
        opts = new LinkedList<>();
        int i = 0 , n = s.length();
        while (i < n ) {
            if (s.charAt(i) == ' ') {
                i++;
            } else if(Character.isDigit(s.charAt(i))) {
                int temp = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    temp = temp * 10 + s.charAt(i) - '0';
                    i++;
                }
            } else if (s.charAt(i) == '(') {
                int cnt = 1;
                int j = i + 1;
                while (j < n && cnt > 0){
                    if(s.charAt(j) == '(') {
                        cnt++;
                    }else if (s.charAt(j) == ')') {
                        cnt--;
                    }
                    j++;
                }
                ans += calculate(s.substring(i + 1 , j - 1));
                i = j;
            } else {
                while (!nums.isEmpty() && !opts.isEmpty() && priority.get(s.charAt(i)) < priority.get(opts.peek())) {
                    int opt2 = nums.pop();
                    int opt1 = nums.pop();
                    nums.push(calculate(opt1 , opt2 , opts.pop()));
                }
            }
        }
        ans += nums.pop();
        return ans;
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
        Solution772 solution772 = new Solution772();
        System.out.println(solution772.calculate("9 + ((3-1)*3+10) / 2"));
    }
}
