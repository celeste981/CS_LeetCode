/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: FloodFill
 * Author:   CS
 * Date:     2021/3/23 14:48
 * Description: 图像渲染
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

/**
 * 〈一句话功能简述〉<br> 
 * 〈图像渲染〉
 *
 * @author CS
 * @create 2021/3/23
 * @since 1.0.0
 */
public class FloodFill {

    public int[][] floodFill( int[][] image , int sr , int sc , int newColor ) {
        int beginColor = image[sr][sc];
        if ( beginColor == newColor ) {
            return image;
        }
        dfs( image , sr , sc , beginColor , newColor );
        return image;
    }

    public void dfs( int[][] image , int x , int y , int beginColor , int newColor ) {
        int m = image.length , n = image[0].length;
        if ( x < 0 || x >= m || y < 0 || y >= n || image[x][y] != beginColor ) {
            return ;
        }
        image[x][y] = newColor;
        dfs( image , x - 1 , y , beginColor , newColor );
        dfs( image , x + 1 , y , beginColor , newColor );
        dfs( image , x , y - 1 , beginColor , newColor );
        dfs( image , x , y + 1 , beginColor , newColor );
    }

    public static void main(String[] args) {
        FloodFill floodFill = new FloodFill();
        System.out.println( floodFill.floodFill( new int[][] { {0,0,0} , {0,1,1} } , 1,1,1));
    }

}
