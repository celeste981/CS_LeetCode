/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution784LetterCasePermutation
 * Author:   CS
 * Date:     2021/4/12 11:01
 * Description: 字母大小写全排列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈字母大小写全排列〉
 *
 * @author CS
 * @create 2021/4/12
 * @since 1.0.0
 */
public class Solution784LetterCasePermutation {

    public List<String> letterCasePermutation( String S ) {
        List<String> ans = new ArrayList<>();
//        String path = "";
        dfs( ans , "" , 0 , S );
        return ans;
    }

    public void dfs( List<String> ans , String path , int idx , String S) {
        if ( idx == S.length() ) {
            ans.add(path);
            return ;
        }
        char c = S.charAt(idx);
        if ( Character.isDigit( c ) ) {
            dfs( ans , path + c , idx + 1 , S );
        }
        if ( Character.isLetter( c ) ) {
            dfs( ans , path + c , idx + 1 , S );
            c ^= ' ';
            dfs( ans , path + c , idx + 1 , S );
        }
    }

    public static void main(String[] args) {
        Solution784LetterCasePermutation solution784LetterCasePermutation = new Solution784LetterCasePermutation();
        System.out.println(solution784LetterCasePermutation.letterCasePermutation("a1b2"));
    }

}
