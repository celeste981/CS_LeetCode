/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1047
 * Author:   CS
 * Date:     2021/3/9 0:20
 * Description: 删除字符串中所有相邻重复项
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈删除字符串中所有相邻重复项〉
 *
 * @author CS
 * @create 2021/3/9
 * @since 1.0.0
 */
public class Solution1047 {

    public String removeDuplicates(String S) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> occ = new Stack<>();
        for (char s : S.toCharArray()) {
            if ( occ.isEmpty() || s != occ.peek() ) {
                occ.push(s);
            } else{
                occ.pop();
            }
        }
        while (!occ.isEmpty()) {
            ans.append(occ.pop());
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        Solution1047 solution1047 = new Solution1047();
        System.out.println(solution1047.removeDuplicates("abbaca"));
    }
}
