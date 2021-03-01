/*
 * @lc app=leetcode.cn id=1319 lang=java
 *
 * [1319] 连通网络的操作次数
 */

// @lc code=start
class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n - 1){
            return -1;
        }
        UnionFind unionFind = new UnionFind(n);
        for(int[] conn : connections){
            unionFind.unite(conn[0] , conn[1]);
        }
        return unionFind.setCount - 1;
    }
}

class UnionFind {
    int[] parent;
    int[] size;
    int n;
    //连通分量数
    int setCount;

    public UnionFind(int n) {
        this.n = n;
        this.setCount = n;
        this.parent = new int[n];
        this.size = new int[n];
        Arrays.fill(size , 1);
        for(int i = 0 ; i < n ; i++){
            parent[i] = i;
        }
    }

    public int find(int x){
        return parent[x] == x ? x : (parent[x] = find(parent[x]));
    }

    public boolean unite(int x , int y){
        x = find(x);
        y = find(y);
        if(x == y){
            return false;
        }
        if(size[x] < size[y]){
            int temp = x;
            x = y;
            y = temp;
        }
        parent[y] = x;
        size[x] = size[x] + size[y];
        --setCount;
        return true;
    }

    public boolean connected(int x , int y){
        x = find(x);
        y = find(y);
        return x == y;
    }
}
// @lc code=end

