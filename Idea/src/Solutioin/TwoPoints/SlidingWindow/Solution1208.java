/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1208
 * Author:   CS
 * Date:     2021/2/2 19:44
 * Description:  尽可能使字符串相等：给你两个长度相同的字符串，s 和 t。  将 s 中的第 i 个字符变到 t 中的第 i 个字符需要 |s[i] - t[i]| 的开销（开销可能为 0），也就是两个字符的 ASCII 码值的差的绝对值。  用于变更字符串的最大预算是 maxCost。在转化字符串时，总开销应当小于等于该预算，这也意味着字符串的转化可能是不完全的。  如果你可以将 s 的子字符串转化为它在 t 中对应的子字符串，则返回可以转化的最大长度。  如果 s 中没有子字符串可以转化成 t 中对应的子字符串，则返回 0。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.TwoPoints.SlidingWindow;

/**
 * 〈一句话功能简述〉<br> 
 * 〈 尽可能使字符串相等：给你两个长度相同的字符串，s 和 t。  将 s 中的第 i 个字符变到 t 中的第 i 个字符需要 |s[i] - t[i]| 的开销（开销可能为 0），也就是两个字符的 ASCII 码值的差的绝对值。  用于变更字符串的最大预算是 maxCost。在转化字符串时，总开销应当小于等于该预算，这也意味着字符串的转化可能是不完全的。  如果你可以将 s 的子字符串转化为它在 t 中对应的子字符串，则返回可以转化的最大长度。  如果 s 中没有子字符串可以转化成 t 中对应的子字符串，则返回 0。〉
 *
 * @author CS
 * @create 2021/2/2
 * @since 1.0.0
 */
public class Solution1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans = 0;
        int n = s.length() , right = 0 ,left = 0 , cost = 0 , maxLen = 0;
        while(right < n){
            cost += Math.abs(s.charAt(right) - t.charAt(right));
            right++;
            while(cost > maxCost){
                cost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            maxLen = Math.max(maxLen , right - left);
        }
        ans = maxLen;
        return ans;
    }
    public static void main(String[] args) {
        Solution1208 solution1208 = new Solution1208();
        System.out.println(solution1208.equalSubstring("abcd" , "bcdf" , 3));
    }
}
