/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution316RemoveDuplicateLetters
 * Author:   CS
 * Date:     2021/4/30 20:15
 * Description: 去除重复字母
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.String;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 〈一句话功能简述〉<br> 
 * 〈去除重复字母〉
 *
 * @author CS
 * @create 2021/4/30
 * @since 1.0.0
 */
public class Solution316RemoveDuplicateLetters {

    public String removeDuplicateLetters(String s) {
        StringBuilder sb = new StringBuilder();
        int[] letters = new int[26];
        boolean[] inStack = new boolean[26];
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            letters[c - 'a']--;
            if (inStack[c - 'a']) {
                continue;
            }
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && letters[stack.peek() - 'a'] > 0 && c < stack.peek()) {
                    inStack[stack.peek() - 'a'] = false;
                    stack.pop();
                }
            }
            stack.push(c);
            inStack[c - 'a'] = true;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution316RemoveDuplicateLetters solution316RemoveDuplicateLetters = new Solution316RemoveDuplicateLetters();
        System.out.println(solution316RemoveDuplicateLetters.removeDuplicateLetters("cbacdcbc"));
    }
}
