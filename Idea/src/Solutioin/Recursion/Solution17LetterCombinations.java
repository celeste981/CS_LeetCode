/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution17LetterCombinations
 * Author:   CS
 * Date:     2021/4/10 10:15
 * Description: 电话号码的字母组合
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈电话号码的字母组合〉
 *
 * @author CS
 * @create 2021/4/10
 * @since 1.0.0
 */
public class Solution17LetterCombinations {

    public HashMap< Character , String > phone = new HashMap<>(){
        {
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }
    };


    public List<String> letterCombinations ( String digits ) {
        int n = digits.length();
        if ( n == 0 ) {
            return new ArrayList<String>();
        }
        List<String> ans = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        dfs( path , n , 0  , digits , ans );
        return ans;
    }

    public void dfs ( StringBuilder path , int n , int begin , String digits , List<String> ans ) {
        if ( path.length() == n ) {
            ans.add(path.toString());
            return ;
        } else {
            String cur = phone.get( digits.charAt(begin) );
            for ( char c : cur.toCharArray() ) {
                path.append(c);
                dfs( path , n , begin + 1, digits , ans );
                path.deleteCharAt(begin);
            }
        }
    }

    public static void main(String[] args) {
        Solution17LetterCombinations solution17LetterCombinations = new Solution17LetterCombinations();
        System.out.println(solution17LetterCombinations.letterCombinations( "23" ));
    }
}
