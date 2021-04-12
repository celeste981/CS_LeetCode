/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution22GenerateParenthesis
 * Author:   CS
 * Date:     2021/4/11 22:40
 * Description: 括号生成
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈括号生成〉
 *
 * @author CS
 * @create 2021/4/11
 * @since 1.0.0
 */
public class Solution22GenerateParenthesis {

    public List<String> generateParenthesis ( int n ) {
        List<String> ans = new ArrayList<>();
//        String path = "";
//        StringBuilder path = new StringBuilder();
        dfs( ans , "" , n , n );
        return ans;
    }

    public void dfs ( List<String> ans , String path , int left , int right ) {
        //dfs结束条件：left == 0 ， right == 0
        if ( left == 0 && right == 0 ) {
            ans.add(path.toString());
//            path = new StringBuilder("");
            return ;
        }
        if ( left > 0 ) {
            dfs( ans , path + '(', left - 1 , right);
        }
        if ( right > left ) {
//            path.append(')');
            dfs( ans , path + ')', left , right - 1);
        }
    }

    public static void main(String[] args) {
        Solution22GenerateParenthesis solution22GenerateParenthesis = new Solution22GenerateParenthesis();
        System.out.println(solution22GenerateParenthesis.generateParenthesis(2));
    }
}
