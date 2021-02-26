/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution394
 * Author:   CS
 * Date:     2021/2/26 9:17
 * Description: 字符串解码
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈字符串解码〉
 *
 * @author CS
 * @create 2021/2/26
 * @since 1.0.0
 */
public class Solution394 {

    public String decodeString(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> multi = new Stack<>();
        Stack<String> chara = new Stack<>();
        int mul = 0;
        for(Character c : s.toCharArray()){
            //如果是字母直接加进答案中
            if(c >= 'a' && c <= 'z') {
                ans.append(c);
            }
            //如果是数字则保存起来
            if(c >= '0' && c <= '9') {
                mul = mul * 10 + c - '0';
            }
            // 遇到左括号
            // 进栈mul和char
            // 清空mul和char
            if(c == '[') {
                multi.push(mul);
                chara.push(ans.toString());
                mul = 0;
                //清空ans
                ans = new StringBuilder();
            }
            // 遇到右括号
            // 保存当前char
            // 清空ans
            // 弹出之前的char
            // 弹出之前的mul
            if(c == ']') {
                String curChar = ans.toString();
                String lastChar = chara.pop();
                ans = new StringBuilder();
                ans.append(lastChar);
                int curMul = multi.pop();
                while(curMul > 0 ) {
                    ans.append(curChar);
                    curMul--;
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Solution394 solution394 = new Solution394();
        System.out.println(solution394.decodeString("3[a2[bc]]"));
    }
}
