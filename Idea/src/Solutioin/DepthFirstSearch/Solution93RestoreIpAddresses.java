/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution93RestoreIpAddresses
 * Author:   CS
 * Date:     2021/4/12 12:20
 * Description: 复原IP地址
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈复原IP地址〉
 *
 * @author CS
 * @create 2021/4/12
 * @since 1.0.0
 */
public class Solution93RestoreIpAddresses {

    public List<String> restoreIpAddresses ( String s ) {
        List<String> ans = new ArrayList<>();
        if ( s.length() < 4 || s.length() > 12 ) {
            return ans;
        }
        dfs( ans , s , 0 , "" , 0 );
        return ans;
    }

    public boolean isLegal ( String s ) {
        return Integer.valueOf(s) <= 255;
    }

    public void dfs( List<String> ans , String s , int idx , String path , int depth ) {
        if ( depth == 4 ) {
            if ( idx == s.length() ) {
                ans.add(path);
            }
            return ;
        }
        String cur = "";
        cur += s.charAt(idx);
        if ( cur.equals("0") ) {
            dfs( ans , s , idx + 1 , path + cur + "." , depth + 1 );
        } else {
            while ( isLegal( cur ) ) {
                dfs( ans , s , idx + 1 , path + cur + ".", depth + 1);
                idx++;
                if ( idx < s.length() ) {
                    cur += s.charAt(idx);
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution93RestoreIpAddresses solution93RestoreIpAddresses = new Solution93RestoreIpAddresses();
        System.out.println(solution93RestoreIpAddresses.restoreIpAddresses("1111"));
    }
}
