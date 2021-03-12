/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution224
 * Author:   CS
 * Date:     2021/3/10 10:26
 * Description: 基本计算器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br>
 * 〈基本计算器〉
 *
 * @author CS
 * @create 2021/3/10
 * @since 1.0.0
 */

public class Solution224 {

//    public int calculate(String s) {
//        int ans = 0;
//        Stack<Integer> nums = new Stack<>();
//        Stack<Character> opts = new Stack<>();
//        boolean first = false;
//        char[] chars = s.toCharArray();
//        for (int i = 0 ; i < chars.length ; i++ ) {
//            //去掉所有空格
//            if (chars[i] == ' ') {
//                continue;
//            }
//            //把所有‘-’换成‘0’ ‘-’
//            if (chars[i] == '-' ) {
//                first = true;
//                nums.push(0);
//                opts.push('-');
//                continue;
//            }
//            if (chars[i] >= '0' && chars[i] <= '9') {
//                int cur = chars[i] - '0';
//                int j = i + 1 ;
//                while(j < chars.length && chars[j] >= '0' && chars[j] <= '9') {
//                    cur = cur * 10 + chars[j] - '0';
//                }
//            }
//        }
//        return ans;
//    }

    //sign入栈
    public int calculate(String s) {
        int ans = 0;
        int sign = 1;
        int n = s.length();
        int i = 0;
        Stack<Integer> opt = new Stack<>();
        opt.push(1);
        while (i < n){
            if (s.charAt(i) == ' ') {
                i++;
                continue;
            } else if (s.charAt(i) == '-') {
                sign = opt.peek()*(-1);
                i++;
            } else if (s.charAt(i) == '+') {
                sign = opt.peek();
                i++;
            } else if (s.charAt(i) == '(') {
                opt.push(sign);
                i++;
            } else if (s.charAt(i) == ')') {
                opt.pop();
                i++;
            } else {
                long tmp = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    tmp = tmp * 10 + s.charAt(i) - '0';
                    i++;
                }
                ans += sign * tmp;
            }
        }
        return ans;
    }


//    //递归代替栈
//    public int calculate(String s) {
//        int ans = 0;
////        char[] chars = s.toCharArray();
//        int n = s.length();
//        int sign = 1;
//        int i = 0;
//        while (i < n) {
//            if (s.charAt(i) == ' ') {
//                i++;
//            } else if (s.charAt(i) == '-') {
//                sign = -1;
//                i++;
//            } else if (s.charAt(i) == '+') {
//                sign = 1;
//                i++;
//            } else if (s.charAt(i) == '(') {
//                int cnt = 1;
//                int index = i + 1;
//                while (index < n && cnt > 0) {
//                    if (s.charAt(index) == '(') {
//                        cnt++;
//                    } else if (s.charAt(index) == ')') {
//                        cnt--;
//                    }
//                    index++;
//                }
//                ans += sign * calculate(s.substring(i+ 1 , index - 1));
//                i = index;
//            } else {
//                long tmp = 0;
//                while (i < n && Character.isDigit(s.charAt(i))) {
//                    tmp = tmp * 10 + s.charAt(i) - '0';
//                    i++;
//                }
//                ans += sign * tmp;
//            }
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        Solution224 solution224 = new Solution224();
        System.out.println(solution224.calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}
