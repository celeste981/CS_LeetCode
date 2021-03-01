/*
 * @lc app=leetcode.cn id=973 lang=java
 *
 * [973] 最接近原点的 K 个点
 */

// @lc code=start
class Solution {
    public int[][] kClosest(int[][] points, int K) {
        //快速选择
        //四个参数：数组、low、high、待求下标
        return quickSelect(points , 0 , points.length - 1 , K - 1);
    }

    private int[][] quickSelect(int [][] points , int low , int high , int idx){
        if(low > high){
            return new int[0][0];
        }
        //一轮快排得到pivot的位置
        //1.如果是index，直接输出前K个
        //2.如果不是index，比较大小，分左右继续快速选择
        int i = partition(points , low , high);
        if(i == idx){
            //Arrays.copyOf
            //返回数组前N位，超过length返回原数组
            //不改变，不新增数组
            return Arrays.copyOf(points , idx + 1);
        }
        else{
            //p1 ? p2 : p3
            //p1为真返回p2，为假返回p2
            return i < idx? quickSelect(points , i + 1 , high , idx ) : quickSelect(points , low , i - 1 , idx );
        }

    }

    private int partition(int[][] points , int low , int high){
        int[] v = points[low];
        int dist = v[0] * v[0] + v[1] * v[1];
        int i = low , j = high + 1;
        while (true) {
            while (++i <= high && points[i][0] * points[i][0] + points[i][1] * points[i][1] < dist);
            while (--j >= low && points[j][0] * points[j][0] + points[j][1] * points[j][1] > dist);
            if (i >= j) {
                break;
            }
            int[] tmp = points[i];
            points[i] = points[j];
            points[j] = tmp;
        }
        points[low] = points[j];
        points[j] = v;
        return j;

    }
}
// @lc code=end

