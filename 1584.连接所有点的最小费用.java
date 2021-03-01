import java.util.Set;

/*
 * @lc app=leetcode.cn id=1584 lang=java
 *
 * [1584] 连接所有点的最小费用
 */

// @lc code=start
class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int[][] graph = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                int distance = dist(points , i , j);
                graph[i][j] = distance;
                graph[j][i] = distance;
            }
        }
        int ans = prim(graph);
        return ans;
    }

    //计算曼哈顿距离
    public int dist(int[][] points, int x, int y) {
        return Math.abs(points[x][0] - points[y][0]) + Math.abs(points[x][1] - points[y][1]);
    }

    public int prim(int[][] graph){
        int n = graph.length;
        int ans = 0;
        Set<Integer> visited = new HashSet<Integer>();
        int[] dis = new int[n];
        //1.把0作为初始结点，初始化dis数组
        for(int i = 0 ; i < n ; i++){
            dis[i] = graph[0][i];
        }
        visited.add(0);
        //2.从1-n选择最短路径
        //3.更新dis数组
        for(int i = 1 ; i < n ; i++){
            int min = Integer.MAX_VALUE;
            int from = 0;
            //选择最短路径
            for(int j = 1 ; j < n ; j++){
                if(!visited.contains(j) && dis[j] < min){
                    from = j;
                    min = dis[j];
                }
            }
            visited.add(from);
            ans = ans + min;
            for(int j = 0 ; j < n ; j++){
                if(graph[from][j] < dis[j]){
                    dis[j] = graph[from][j];
                }
            }
        }


        return ans;
    }

}
// @lc code=end

