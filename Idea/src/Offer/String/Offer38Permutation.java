/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer38Permutation
 * Author:   CS
 * Date:     2021/4/22 12:55
 * Description: 字符串的排列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.String;

import java.util.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈字符串的排列〉
 *
 * @author CS
 * @create 2021/4/22
 * @since 1.0.0
 */
public class Offer38Permutation {

    public String[] permutation ( String s ) {
        List<String> ans = new ArrayList<>();
        char[] cs = s.toCharArray();
        //为去重剪枝做准备
        Arrays.sort(cs);
        boolean[] visited = new boolean[s.length()];
        String path = "";
        dfs( ans , path , cs , visited , s.length() );
        return ans.toArray(new String[ans.size()]);
    }

    public void dfs( List<String> ans , String path , char[] cs , boolean[] visited , int n ) {
        if ( path.length() == n ) {
            ans.add(path);
            System.out.println( path );
            return ;
        }
        for ( int i = 0 ; i < n ; i++ ) {
            if ( !visited[i] ) {
                if ( i > 0 && cs[i] == cs[i-1] && !visited[i-1] ) {
                    continue;
                }
                visited[i] = true;
                dfs( ans , path + cs[i] , cs , visited , n );
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Offer38Permutation offer38Permutation = new Offer38Permutation();
//        offer38Permutation.permutation( "abc" );
        offer38Permutation.permutation( "aac" );
//        System.out.println( offer38Permutation.permutation("abc") );
    }
}
