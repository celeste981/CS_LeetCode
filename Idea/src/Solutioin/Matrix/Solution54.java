/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution54
 * Author:   CS
 * Date:     2021/2/25 10:07
 * Description: 螺旋矩阵
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈螺旋矩阵〉
 *
 * @author CS
 * @create 2021/2/25
 * @since 1.0.0
 */
public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int left = 0 , right = matrix[0].length  - 1 , top = 0 , down = matrix.length - 1 ;
        int total = matrix[0].length * matrix.length;
        while(total > 0) {
            //从左往右
            for(int i = left ; i <= right && total > 0 ; i++ ) {
                ans.add(matrix[top][i]);
                total--;
            }   top++;
            //从上往下
            for(int i = top ; i <= down && total > 0 ; i++ ) {
                ans.add(matrix[i][right]);
                total--;
            }   right--;
            //从右往左
            for(int i = right ; i >= left && total > 0 ; i-- ) {
                ans.add(matrix[down][i]);
                total--;
            }   down--;
            //从下往上
            for(int i = down ; i >= top && total > 0 ; i-- ) {
                ans.add(matrix[i][left]);
                total--;
            }   left++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution54 solution54 = new Solution54();
        System.out.println(solution54.spiralOrder(new int[][]{ {1,2,3,4} , {5,6,7,8} , {9,10,11,12} }));
    }
}
