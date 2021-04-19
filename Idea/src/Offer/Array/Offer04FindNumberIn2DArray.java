/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer04FindNumberIn2DArray
 * Author:   CS
 * Date:     2021/4/16 10:29
 * Description: 二维数组中的查找
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.Array;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二维数组中的查找〉
 *
 * @author CS
 * @create 2021/4/16
 * @since 1.0.0
 */
public class Offer04FindNumberIn2DArray {

    public boolean findNumberIn2DArray ( int[][] matrix , int target ) {
        if ( matrix.length == 0 ) {
            return false;
        }
        int m = matrix.length , n = matrix[0].length;
        int startX = 0 , startY = n - 1 ;
        while ( startX < m && startY >= 0 ) {
            if ( matrix[startX][startY] == target ) {
                return true;
            }
            if ( matrix[startX][startY] > target ) {
                startY--;
            } else if ( matrix[startX][startY] < target ) {
                //这里的else很重要！！！
                //上面的if中startY已经被修改了，如果只写成if
                //就不是当初那个数字了
                //用else if 匹配到同一个数字
                startX--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Offer04FindNumberIn2DArray offer04FindNumberIn2DArray = new Offer04FindNumberIn2DArray();

    }

}
