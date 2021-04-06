/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution45Daily
 * Author:   CS
 * Date:     2021/3/15 8:38
 * Description: 螺旋矩阵
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Matrix;

import java.util.LinkedList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈螺旋矩阵〉
 *
 * @author CS
 * @create 2021/3/15
 * @since 1.0.0
 */
public class Solution45SpiralOrder {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new LinkedList<>();
        int up = 0 , down = matrix.length - 1 , left = 0 , right = matrix[0].length - 1;
        int total = matrix[0].length * matrix.length;
        while (total > 0 ) {
            for (int i = left ; i <= right ; i++ ) {
                ans.add(matrix[up][i]);
                total--;
            }   up++;
            for (int i = up ; i <= down ; i++ ) {
                ans.add(matrix[i][right]);
                total--;
            }   right--;
            for (int i = right ; i >= left ; i-- ) {
                ans.add(matrix[down][i]);
                total--;
            }   down--;
            for (int i = down ; i >= up ; i-- ) {
                ans.add(matrix[i][left]);
                total--;
            }   left++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution45SpiralOrder solution45Daily = new Solution45SpiralOrder();
        System.out.println(solution45Daily.spiralOrder(new int[][] { {1,2,3} , {4,5,6} , {7,8,9}}));
    }
}
