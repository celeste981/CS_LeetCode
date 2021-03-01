/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        //二分查找
        int left = 0 , right = m * n - 1;
        int midId , midEle;
        while(left <= right){
            midId = (left + right) / 2;
            midEle = matrix[midId / n][midId % n];
            if(target == midEle){
                return true;
            }
            else{
                if(target < midEle){
                    right = midId - 1;
                }
                else{
                    left = midId + 1;
                }
            }
        }
        return false;
    }
}

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //作为坐标的话下标要减一，否则会出现runtime Error
        int startX = 0;
        int startY = matrix[0].length - 1;
        while(startX < matrix.length && startY >= 0){
            if(target == matrix[startX][startY]){
                return true;
            }
            else if(target > matrix[startX][startY]){
                startX++;
            }
            else if(target < matrix[startX][startY]){
                startY--;
            }
        }
        return false;
    }
}
// @lc code=end