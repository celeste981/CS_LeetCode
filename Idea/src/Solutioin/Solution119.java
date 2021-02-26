/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution119
 * Author:   CS
 * Date:     2021/2/12 0:19
 * Description: 杨辉三角||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈杨辉三角||〉
 *
 * @author CS
 * @create 2021/2/12
 * @since 1.0.0
 */
public class Solution119 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<Integer>();
        ans.add(1);
        for(int i = 1 ; i <= rowIndex ; i++){
           ans.add(0);
           for(int j = i ; j > 0 ; j--) {
               ans.set(j , ans.get(j) + ans.get(j - 1));
           }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution119 solution119 = new Solution119();
        System.out.println(solution119.getRow(3));
    }
}
