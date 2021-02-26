/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution765
 * Author:   CS
 * Date:     2021/2/14 1:49
 * Description: 情侣牵手：N 对情侣坐在连续排列的 2N 个座位上，想要牵到对方的手。 计算最少交换座位的次数，以便每对情侣可以并肩坐在一起。 一次交换可选择任意两人，让他们站起来交换座位。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 〈一句话功能简述〉<br> 
 * 〈情侣牵手：
 *  N 对情侣坐在连续排列的 2N 个座位上，想要牵到对方的手。
 *  计算最少交换座位的次数，以便每对情侣可以并肩坐在一起。
 *  一次交换可选择任意两人，让他们站起来交换座位。〉
 *
 * @author CS
 * @create 2021/2/14
 * @since 1.0.0
 */
public class Solution765 {

    public int minSwapsCouples(int[] row) {
        //广度优先搜索
        int ans = 0;
        int n = row.length;
        int tot = n / 2;
        List<Integer>[] graph = new List[tot];
        for(int i = 0 ; i < tot ; i++){
            graph[i] = new ArrayList<Integer>();
        }
        for(int i = 0 ; i < n ; i += 2){
            int l = row[i] / 2;
            int r = row[i + 1] / 2;
            if( l != r) {
                graph[l].add(r);
                graph[r].add(l);
            }
        }
        boolean[] visited = new boolean[tot];
        int ret = 0;
        for(int i = 0 ; i < tot ; i++) {
            if(!visited[i]){
                Queue<Integer> queue = new LinkedList<Integer>();
                visited[i] = true;
                queue.offer(i);
                int cnt = 0;
                while(!queue.isEmpty()) {
                    int x = queue.poll();
                    cnt++;
                    for(int y : graph[x]){
                        if (!visited[y]) {
                            visited[y] = true;
                            queue.offer(y);
                        }
                    }
                }
                ans += cnt - 1 ;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution765 solution765 = new Solution765();
        System.out.println(solution765.minSwapsCouples(new int[]{ 0 , 2 , 1 , 3 }));
    }
}
