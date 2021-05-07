/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1334FindTheCity
 * Author:   CS
 * Date:     2021/5/7 10:13
 * Description: 阈值距离内邻居最少的城市
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈阈值距离内邻居最少的城市〉
 *
 * @author CS
 * @create 2021/5/7
 * @since 1.0.0
 */
public class Solution1334FindTheCity {

    public int finTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] floyed = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(floyed[i], 0x3f3f3f3f);
            floyed[i][i] = 0;
        }
        //创建初始路径矩阵
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            floyed[from][to] = edge[2];
            floyed[to][from] = edge[2];
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    floyed[i][j] = Math.min(floyed[i][j], floyed[i][k] + floyed[k][j]);
                }
            }
        }
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (floyed[i][j] <= distanceThreshold) {
                    count[i]++;
                    count[j]++;
                }
            }
        }
        int min = count[0];
        int idx = 0;
        for (int i = 1; i < n; i++) {
            if (count[i] <= min) {
                min = count[i];
                idx = i;
            }
        }
        return idx;
    }

    public static void main(String[] args) {

    }
}
