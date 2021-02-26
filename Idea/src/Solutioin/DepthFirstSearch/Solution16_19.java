/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution16_19
 * Author:   CS
 * Date:     2021/2/4 19:22
 * Description: 水域大小：你有一个用于表示一片土地的整数矩阵land，该矩阵中每个点的值代表对应地点的海拔高度。若值为0则表示水域。由垂直、水平或对角连接的水域为池塘。池塘的大小是指相连接的水域的个数。编写一个方法来计算矩阵中所有池塘的大小，返回值需要从小到大排序。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DepthFirstSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈水域大小：你有一个用于表示一片土地的整数矩阵land，
 * 该矩阵中每个点的值代表对应地点的海拔高度。
 * 若值为0则表示水域。
 * 由垂直、水平或对角连接的水域为池塘。
 * 池塘的大小是指相连接的水域的个数。
 * 编写一个方法来计算矩阵中所有池塘的大小，
 * 返回值需要从小到大排序。〉
 *
 * @author CS
 * @create 2021/2/4
 * @since 1.0.0
 */
public class Solution16_19 {
    public int[] pondSizes(int[][] land) {
        List<Integer> ans = new ArrayList<>();
        int temp;
        for(int i = 0 ; i < land.length ; i++){
            for(int j = 0 ; j < land[0].length ; j++){
                if(0 == land[i][j]){
                    temp = findPool(land , i , j);
                    if(temp != 0){
                        ans.add(temp);
                    }
                }
            }
        }
        int[] res = ans.stream().mapToInt(Integer :: valueOf).toArray();
        Arrays.sort(res);
        return res;
    }

    public int findPool(int[][] land , int x , int y){
        int num = 0;
        if(x < 0 || y < 0 || x >= land.length || y >= land[0].length || land[x][y]!= 0){
            return num;
        }
        num++;
        land[x][y] = -1;    //遍历过就转换为非零值
        num += findPool(land , x+1 , y);
        num += findPool(land , x+1 , y+1);
        num += findPool(land , x+1 , y-1);
        num += findPool(land , x , y+1);
        num += findPool(land , x , y-1);
        num += findPool(land , x-1 , y);
        num += findPool(land , x-1 , y+1);
        num += findPool(land , x-1 , y-1);
        return num;
    }

    public static void main(String[] args) {
        Solution16_19 solution16_19 = new Solution16_19();
        System.out.println(Arrays.toString(solution16_19.pondSizes(new int[][]{
                {0,2,1,0},{0,1,0,1},{1,1,0,1},{0,1,0,1}
        })));
    }
}
