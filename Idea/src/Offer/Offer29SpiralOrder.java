/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer29SpiralOrder
 * Author:   CS
 * Date:     2021/5/7 12:43
 * Description: 顺时针打印矩阵
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈顺时针打印矩阵〉
 *
 * @author CS
 * @create 2021/5/7
 * @since 1.0.0
 */
public class Offer29SpiralOrder {

    public int[] spiralOrder(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) {
            return new int[]{};
        }
        int n = matrix[0].length;
        int total = m * n;
        int idx = 0;
        int[] ans = new int[total];
        int up = 0, down = m - 1;
        int left = 0, right = n - 1;
        while (idx < total) {
            // 顺时针从左往右，从上往下，从右往左，从下往上
            for (int j = left; j <= right; j++) {
                // 从左往右
                ans[idx++] = matrix[up][j];
            } if (++up > down) {
                break;
            }
            for (int j = up; j <= down; j++) {
                // 从上往下
                ans[idx++] = matrix[j][right];
            } if (--right < left) {
                break;
            }
            for (int j = right; j >= left; j--) {
                // 从右往左
                ans[idx++] = matrix[down][j];
            } if (--down < up) {
                break;
            }
            for (int j = down; j >= up; j--) {
                // 从下往上
                ans[idx++] = matrix[j][left];
            } if (++left > right) {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
        // {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        Offer29SpiralOrder offer29SpiralOrder = new Offer29SpiralOrder();
        System.out.println(Arrays.toString(offer29SpiralOrder.spiralOrder(matrix)));
    }
}
