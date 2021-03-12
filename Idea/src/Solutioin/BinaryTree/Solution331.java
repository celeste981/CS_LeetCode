/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution331
 * Author:   CS
 * Date:     2021/3/12 8:49
 * Description: 验证二叉树的前序序列化
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈验证二叉树的前序序列化〉
 *
 * @author CS
 * @create 2021/3/12
 * @since 1.0.0
 */
public class Solution331 {

    //栈来维护槽位
    //为什么  9,3,4,#,#,1,#,#,2,#,6,#,#   可以表示一颗二叉树
    //完整符合槽位要求的，就是合理的吗？
//    public boolean isValidSerialization(String preorder) {
//        int n = preorder.length();preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#"
//        int i = 0;
//        Deque<Integer> stack = new LinkedList<>();
//        stack.push(1);
//        while (i < n) {
//            char tmp = preorder.charAt(i);
//            if (stack.isEmpty()) {
//                return false;
//            }
//            if (preorder.charAt(i) == ',') {
//                i++;
//            } else if (preorder.charAt(i) == '#') {
//                int top = stack.pop() - 1;
//                if (top > 0) {
//                    stack.push(top);
//                }
//                i++;
//            } else {
//                //读入一个数字
//                while (i < n && preorder.charAt(i) != ',' ) {
//                    i++;
//                }
//                int top = stack.pop() - 1;
//                //还有剩余位置的话，就把剩余位置加进去
//                if (top > 0) {
//                    stack.push(top);
//                }
//                stack.push(2);
//            }
//        }
//        return stack.isEmpty();
//    }

    public boolean isValidSerialization(String preorder) {
        int ans = 1;
        int i = 0 , n = preorder.length();
        while ( i < n ) {
            if (ans <= 0) {
                return false;
            }
            if (preorder.charAt(i) == ',')  {
                i++;
            } else if (preorder.charAt(i) == '#') {
                ans--;
                i++;
            } else {
                while ( i < n && preorder.charAt(i) != ',') {
                    i++;
                }
                ans++;
            }
        }
        return ans == 0;
    }

    public static void main(String[] args) {
        Solution331 solution331 = new Solution331();
        System.out.println(solution331.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
    }
}
