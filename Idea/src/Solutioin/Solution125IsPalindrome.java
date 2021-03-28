/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution125IsPalindrome
 * Author:   CS
 * Date:     2021/3/26 10:58
 * Description: 验证回文串
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈验证回文串〉
 *
 * @author CS
 * @create 2021/3/26
 * @since 1.0.0
 */
public class Solution125IsPalindrome {

    public boolean isPalindrome ( String s ) {
        char[] chara = s.toLowerCase().toCharArray();
        int i = 0 , j = chara.length - 1;
        while ( i <= j ) {
            if ( (Character.isLetterOrDigit(chara[i]) )&& Character.isLetterOrDigit(chara[j])) {
                if ( chara[i] != chara[j] ) {
                    return false;
                }
                i++;
                j--;
            } else {
                if ( !Character.isLetterOrDigit(chara[i])) {
                    i++;
                }
                if ( !Character.isLetterOrDigit(chara[j])) {
                    j--;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution125IsPalindrome solution125IsPalindrome = new Solution125IsPalindrome();
        System.out.println(solution125IsPalindrome.isPalindrome("0P"));;
    }
}
