/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution3
 * Author:   CS
 * Date:     2021/2/2 1:29
 * Description: 无重复字符的最长子串：给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br> 
 * 〈无重复字符的最长子串：给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。〉
 *
 * @author CS
 * @create 2021/2/2
 * @since 1.0.0
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int n = s.length() , right = 0 , left = 0 ;
        Set<Character> occ = new HashSet<Character>();
        while(right < n){
            if(!occ.contains(s.charAt(right))){
                occ.add(s.charAt(right++));
                ans = Math.max(right - left , ans);
            }
            else{
                occ.remove(s.charAt(left++));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.lengthOfLongestSubstring("abcabcbb"));
    }
}
