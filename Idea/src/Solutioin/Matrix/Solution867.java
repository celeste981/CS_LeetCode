/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution867
 * Author:   CS
 * Date:     2021/2/25 9:56
 * Description: 转置矩阵
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Matrix;

/**
 * 〈一句话功能简述〉<br> 
 * 〈转置矩阵〉
 *
 * @author CS
 * @create 2021/2/25
 * @since 1.0.0
 */
public class Solution867 {

    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for(int i = 0 ; i < matrix.length ; i++) {
            for(int j = 0 ; j < matrix[0].length ; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution867 solution867 = new Solution867();
        //System.out.println();
    }
}
