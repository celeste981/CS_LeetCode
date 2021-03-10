///**
// * Copyright (C), 2016-2021, 华中科技大学
// * FileName: Solution224
// * Author:   CS
// * Date:     2021/3/10 10:26
// * Description: 基本计算器
// * History:
// * <author>          <time>          <version>          <desc>
// * 作者姓名           修改时间           版本号              描述
// */
//package Solutioin;
//
//import java.util.Stack;
//
///**
// * 〈一句话功能简述〉<br>
// * 〈基本计算器〉
// *
// * @author CS
// * @create 2021/3/10
// * @since 1.0.0
// */
//
//public class Solution224 {
//
//    public int calculate(String s) {
//        int ans = 0;
//        Stack<Integer> nums = new Stack<>();
//        Stack<Character> brackects = new Stack<>();
//        int temp = 0;
//        for (char c : s.toCharArray()) {
//            while (c >= '0' && c <= '9') {
//                temp = temp * 10 + c - '0';
//            }
//            if (temp != 0 ) {
//                nums.push(temp);
//            }
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        Solution224 solution224 = new Solution224();
//        System.out.println(solution224.calculate("(1+(4+5+2)-3)+(6+8)"));
//    }
//}
