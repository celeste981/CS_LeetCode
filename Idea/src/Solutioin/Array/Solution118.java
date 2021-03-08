/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution118
 * Author:   CS
 * Date:     2021/2/12 22:55
 * Description: 杨辉三角
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈杨辉三角〉
 *
 * @author CS
 * @create 2021/2/12
 * @since 1.0.0
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i = 0 ; i < numRows ; i++ ) {
            List<Integer> row = new ArrayList<Integer>();
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else {
                    row.add( ans.get(i-1).get(j-1) + ans.get(i-1).get(j) );
                }
            }
            ans.add(row);
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution118 solution118 = new Solution118();
        System.out.println(solution118.generate(5));
    }
}
