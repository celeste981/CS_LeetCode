/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer05ReplaceSpace
 * Author:   Administrator
 * Date:     2021/4/19 12:03
 * Description: 替换空格
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.Array;

/**
 * 〈一句话功能简述〉<br> 
 * 〈替换空格〉
 *
 * @author Administrator
 * @create 2021/4/19
 * @since 1.0.0
 */
public class Offer05ReplaceSpace {
    public String replaceSpace ( String s ) {
//        StringBuilder sb = new StringBuilder(s);
//        for ( char c : s.toCharArray() ) {
//            if ( c == ' ' ) {
//                sb.append("  ");
//            }
//        }
//        int j = sb.length() - 1;
//        int i = s.length() - 1;
//        while ( i >= 0 && j >= 0 ) {
//            if ( s.charAt(i) != ' ' ) {
//                sb.setCharAt( j , s.charAt(i) );
//                j--;
//            } else {
//                sb.setCharAt( j-- , '0' );
//                sb.setCharAt( j-- , '2' );
//                sb.setCharAt( j-- , '%' );
//            }
//            i--;
//        }
//        return sb.toString();
        StringBuilder res = new StringBuilder();
        for( char c : s.toCharArray() )
        {
            if(c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Offer05ReplaceSpace offer05ReplaceSpace = new Offer05ReplaceSpace();
        System.out.println(offer05ReplaceSpace.replaceSpace( "We are happy."));
    }

}
