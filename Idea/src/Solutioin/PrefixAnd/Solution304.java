/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution304
 * Author:   CS
 * Date:     2021/3/2 8:57
 * Description: 二维区域和检索-矩阵不可变
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.PrefixAnd;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二维区域和检索-矩阵不可变〉
 *
 * @author CS
 * @create 2021/3/2
 * @since 1.0.0
 */
public class Solution304 {

    int[][] sum ;

    public Solution304(int[][] matrix) {
        int m = matrix.length;
        if ( m > 0 ) {
            int n = matrix[0].length;
            sum = new int[m+1][n+1];
            for (int i = 0 ; i < n ; i++ ) {
                for (int j = 0 ; j < m ; j++ ) {
                    sum[i+1][j+1] = matrix[i][j] - sum[i][j];
                    sum[i+1][j+1] +=  sum[i][j+1];
                    sum[i+1][j+1] +=  sum[i+1][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = sum[row2+1][col2+1] + sum[row1][col1] ;
        ans -= sum[row1][col2+1] ;
        ans -= sum[row2+1][col1] ;
        return ans;
    }

    public static void main(String[] args) {
        Solution304 solution304 = new Solution304(new int[][]{ {3, 0, 1, 4, 2} , {5, 6, 3, 2, 1} , {1, 2, 0, 1, 5} , {4, 1, 0, 1, 7} , {1, 0, 3, 0, 5}});
        System.out.println(solution304.sumRegion(1,2,2,4));
    }
}
