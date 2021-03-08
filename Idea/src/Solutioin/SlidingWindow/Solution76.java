///**
// * Copyright (C), 2016-2021, 华中科技大学
// * FileName: Solution76
// * Author:   CS
// * Date:     2021/2/9 12:17
// * Description: 最小覆盖子串：给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
// * History:
// * <author>          <time>          <version>          <desc>
// * 作者姓名           修改时间           版本号              描述
// */
//package Solutioin;
//
//import java.util.HashSet;
//import java.util.Set;
//
///**
// * 〈一句话功能简述〉<br>
// * 〈最小覆盖子串：给你一个字符串 s 、一个字符串 t 。
// * 返回 s 中涵盖 t 所有字符的最小子串。
// * 如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。〉
// *
// * @author CS
// * @create 2021/2/9
// * @since 1.0.0
// */
//public class Solution76 {
//
//    public String minWindow(String s, String t) {
//        StringBuilder ans = new StringBuilder();
//        int ns = s.length() , nt = t.length() ;
//        Set<Character> occ = new HashSet<Character>();
//        for(int i = 0 ; i < nt ; i++){
//            occ.add(t.charAt(i));
//        }
//        int right = 0 , left = 0 , max = 0;
//        while(right < ns){
//            //while()
//        }
//        return ans.toString();
//    }
//
//    public static void main(String[] args) {
//        Solution76 solution76 = new Solution76();
//        System.out.println(solution76.minWindow("ADOBECODEBANC" , "ABC"));
//    }
//}
