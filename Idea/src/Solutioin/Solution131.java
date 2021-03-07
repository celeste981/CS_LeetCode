///**
// * Copyright (C), 2016-2021, 华中科技大学
// * FileName: Solution131
// * Author:   CS
// * Date:     2021/3/7 14:10
// * Description: 最长回文子串
// * History:
// * <author>          <time>          <version>          <desc>
// * 作者姓名           修改时间           版本号              描述
// */
//package Solutioin;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * 〈一句话功能简述〉<br>
// * 〈分割回文串〉
// *
// * @author CS
// * @create 2021/3/7
// * @since 1.0.0
// */
//public class Solution131 {
//
//    public List<List<String>> partition(String s) {
//        boolean[][] f;
//        List<List<String>> ret = new ArrayList<List<String>>();
//        List<String> ans = new ArrayList<String>();
//        int n;
//
//
//
//            dfs(s, 0);
//            return ret;
//    }
//
//    public void dfs(String s, int i) {
//        if (i == n) {
//            ret.add(new ArrayList<String>(ans));
//            return;
//        }
//        for (int j = i; j < n; ++j) {
//            if (f[i][j]) {
//                ans.add(s.substring(i, j + 1));
//                dfs(s, j + 1);
//                ans.remove(ans.size() - 1);
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Solution131 solution131 = new Solution131();
//    }
//}
