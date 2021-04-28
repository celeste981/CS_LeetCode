/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution48Rotate
 * Author:   CS
 * Date:     2021/4/28 9:27
 * Description: 旋转图像
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Array.Matrix;

/**
 * 〈一句话功能简述〉<br> 
 * 〈旋转图像〉
 *
 * @author CS
 * @create 2021/4/28
 * @since 1.0.0
 */
public class Solution48Rotate {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //水平翻转
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = tmp;
            }
        }
        //沿主对角线翻转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    public static void main(String[] args) {

    }
}
