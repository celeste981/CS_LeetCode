/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution28StrStr
 * Author:   CS
 * Date:     2021/4/14 12:14
 * Description: 实现strStr()
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

/**
 * 〈一句话功能简述〉<br> 
 * 〈实现strStr()〉
 *
 * @author CS
 * @create 2021/4/14
 * @since 1.0.0
 */
public class Solution28StrStr {

    public int strStr(String haystack, String needle) {
        if ( needle.length() > haystack.length() ) {
            return -1;
        }
        //???
//        if ( needle == "" ){
//            return 0;
//        }
        if ( needle.equals("") ) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for ( int i = 0 ; i < haystack.length() ; i++ ) {
            if ( haystack.length() - i < needle.length() ) {
                break;
            }
            stringBuilder.append(haystack , i , i + needle.length() );
//            stringBuilder.append( haystack , i , haystack.length() );
            System.out.println(stringBuilder);
            if ( stringBuilder.toString().equals(needle) ) {
                return i;
            }
            stringBuilder.delete(0,stringBuilder.length());
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution28StrStr solution28StrStr = new Solution28StrStr();
        solution28StrStr.strStr("hello" , "ll");
    }
}
