import java.util.Map;

import jdk.internal.org.jline.terminal.impl.jna.win.Kernel32.UnionChar;

/*
 * @lc app=leetcode.cn id=947 lang=java
 *
 * [947] 移除最多的同行或同列石头
 */
//最大可以减去的石头个数 = 石头总数 - 连通分量的个数

// @lc code=start
class Solution {
    public int removeStones(int[][] stones) {
        UnionFind UnionFind = new UnionFind();
        for(int[] stone : stones){
            //避免底层数字的重复
            //加10001
            // UnionFind.Union(~stone[0] , stone[1]);
                // UnionFind.Union(stone[0] - 10001, stone[1]);
            UnionFind.union(stone[0] + 10001 , stone[1]);
        }
        return stones.length - UnionFind.getCount();
    }

    public class UnionFind{
        //hash可以动态扩容
        private Map<Integer , Integer> parent;
        private int count;
        public UnionFind(){
            this.parent = new HashMap<>();
            this.count = 0;
        }
        public int getCount(){
            return count;
        }
        public int find(int x){
            if(!parent.containsKey(x)){
                parent.put(x , x);
                //并查集中新加入一个结点，结点的父亲结点是它自己，所以连通分量的总数+1
                count++;
            }
            if(x != parent.get(x)){
                parent.put(x, find(parent.get(x)));
            }
            return parent.get(x);
        }

        public void union(int x , int y){
            int rootX = find(x);
            int rootY = find(y);
            if(rootX == rootY){
                return ;
            }
            parent.put(rootX, rootY);
            //合并两个连通分量，连通分量总数-1
            count--;
        }
    }
}
// @lc code=end

