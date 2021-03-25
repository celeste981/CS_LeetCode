/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution96NumTrees
 * Author:   CS
 * Date:     2021/3/25 15:07
 * Description: 不同的二叉搜索树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈不同的二叉搜索树〉
 *
 * @author CS
 * @create 2021/3/25
 * @since 1.0.0
 */
public class Solution96NumTrees {
    public int numTrees ( int n ) {
        int[] G = new int[ n + 1];
        G[0] = 1;
        G[1] = 1;

        for ( int i = 2 ; i <= n ; i++ ) {
            for ( int j = 1 ; j <= i ; j++ ) {
                G[i] += G[j - 1] * G[ i - j ];
            }
        }
        return G[n];
    }
}
