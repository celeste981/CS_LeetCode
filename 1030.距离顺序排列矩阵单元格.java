/*
 * @lc app=leetcode.cn id=1030 lang=java
 *
 * [1030] 距离顺序排列矩阵单元格
 */

// @lc code=start
class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        //1.1开辟R*C行数组空间
        int[][] ret = new int[R*C][];
        //1.2.存储所有结点信息
        for(int i = 0 ; i < R ; i++){
            for(int j = 0 ; j < C ; j++){
                ret[i * C + j] = new int[] {i , j};
            }
        }
        //2.曼哈顿排序
        Arrays.sort(ret , new Comparator<int []> () {
            public int compare(int[] a , int[] b){
                return ( ( Math.abs(a[0] - r0) + Math.abs(a[1] - c0) ) - ( Math.abs(b[0] - r0) + Math.abs(b[1] - c0) ));
            }
        });
        return ret;
    }
}
// @lc code=end

