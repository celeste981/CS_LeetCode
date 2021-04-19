/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution424
 * Author:   CS
 * Date:     2021/2/2 0:03
 * Description: 替换后的最长重复字符：给你一个仅由大写英文字母组成的字符串，你可以将任意位置上的字符替换成另外的字符，总共可最多替换 k 次。在执行上述操作后，找到包含重复字母的最长子串的长度。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.TwoPoints.SlidingWindow;

/**
 * 〈一句话功能简述〉<br> 
 * 〈替换后的最长重复字符：
 * 给你一个仅由大写英文字母组成的字符串，你可以将任意位置上的字符替换成另外的字符，
 * 总共可最多替换 k 次。在执行上述操作后，找到包含重复字母的最长子串的长度。〉
 *
 * @author CS
 * @create 2021/2/2
 * @since 1.0.0
 */
public class Solution424 {

    public int characterReplacement(String s, int k) {
        int ans = 0;
        int right = 0 , left = 0 , max = 0;
        int[] occ = new int[26];
        while(right < s.length()){
            //最开始直接计数，右指针移动，记录当前区间字母出现最多次数max，左指针不变
            occ[s.charAt(right) - 'A']++;
            max = Math.max(max , occ[s.charAt(right++) - 'A']);
            //临界条件：区间（左闭右闭）内个数超过了max+k个
            if(right - left > max + k){
                occ[s.charAt(left++) - 'A']--;
            }
        }
        ans = right - left;
        return ans;
    }

    public static void main(String[] args) {
        Solution424 solution424 = new Solution424();
        System.out.println(solution424.characterReplacement("AABABBA" , 1));
    }
}
