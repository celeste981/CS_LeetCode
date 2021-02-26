/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution59
 * Author:   CS
 * Date:     2021/2/25 11:06
 * Description: 螺旋矩阵||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Matrix;

/**
 * 〈一句话功能简述〉<br> 
 * 〈螺旋矩阵||〉
 *
 * @author CS
 * @create 2021/2/25
 * @since 1.0.0
 */
public class Solution59 {

    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int count = 0 , total = n * n;
        int left = 0 , right = n - 1 , top = 0 , down = n - 1 ;
        while(count < total) {
            //从左往右
            for(int i = left ; i <= right && count < total ; i++ ) {
                ans[top][i] = ++count;
            }   top++;
            //从上往下
            for(int i = top ; i <= down && count < total ; i++ ) {
                ans[i][right] = ++count;
            }   right--;
            //从右往左
            for(int i = right ; i >= left && count < total ; i-- ) {
                ans[down][i] = ++count;
            }   down--;
            //从下往上
            for(int i = down ; i >= top && count < total ; i-- ) {
                ans[i][left] = ++count;
            }   left++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution59 solution59 = new Solution59();
        solution59.generateMatrix(4);
    }
}
