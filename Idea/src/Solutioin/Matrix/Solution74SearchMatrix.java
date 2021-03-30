/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution74SearchMatrix
 * Author:   CS
 * Date:     2021/3/30 8:26
 * Description: 搜索二维矩阵
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Matrix;

/**
 * 〈一句话功能简述〉<br> 
 * 〈搜索二维矩阵〉
 *
 * @author CS
 * @create 2021/3/30
 * @since 1.0.0
 */
public class Solution74SearchMatrix {

//    public boolean searchMatrix(int[][] matrix, int target) {
//
//        int m = matrix.length - 1 ;
//        int n = matrix[0].length - 1;
//
//        for ( int i = m ; i >= 0 ; i-- ) {
//            if ( target == matrix[i][0] ) {
//                return true;
//            }
//            if ( target < matrix[i][0] ) {
//                continue;
//            }
//            if ( target > matrix[i][0] ) {
//                int left = 1 , right = n;
//                while ( right >= left ) {
//                    int mid = ( right - left ) / 2 + left;
//                    if ( target == matrix[i][mid] ) {
//                        return true;
//                    } else if ( target < matrix[i][mid] ) {
//                        right = mid - 1;
//                    } else {
//                        left = mid + 1;
//                    }
//                }
//            }
//        }
//
//        return false;
//    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int startX = m - 1 , startY = 0;
        while ( startX >= 0 && startY < n ) {
            if ( target == matrix[startX][startY] ) {
                return true;
            } else if ( target < matrix[startX][startY] ) {
                startX--;
            } else {
                startY++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution74SearchMatrix solution74SearchMatrix = new Solution74SearchMatrix();
        System.out.println( solution74SearchMatrix.searchMatrix( new int[][]{
                {1,3,5,7} , {10,11,16,20} , {23,30,34,60}
        } , 13));
    }
}
