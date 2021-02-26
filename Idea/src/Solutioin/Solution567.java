/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution567
 * Author:   CS
 * Date:     2021/2/10 13:40
 * Description: 字符串的排列：给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈字符串的排列：给定两个字符串 s1 和 s2，
 * 写一个函数来判断 s2 是否包含 s1 的排列。〉
 *
 * @author CS
 * @create 2021/2/10
 * @since 1.0.0
 */
public class Solution567 {

    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length() , n2 = s2.length();
        if(n2 < n1){
            return false;
        }
        int[] occ = new int[26];
        int[] window = new int[26];
        for(int i = 0 ; i < n1 ; i++){
            occ[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(occ , window)){
            return true;
        }
        int right = n1;
        while(right < n2){
            window[s2.charAt(right) - 'a']++;
            window[s2.charAt(right - n1) - 'a']--;
            if(Arrays.equals(occ , window)){
                return true;
            }
            right++;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution567 solution567 = new Solution567();
        System.out.println(solution567.checkInclusion("ab" , "eidbaooo"));
        //"ab" , "eidboaoo"
    }
}
