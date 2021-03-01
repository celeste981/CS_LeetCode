/*
 * @lc app=leetcode.cn id=1004 lang=java
 *
 * [1004] 最大连续1的个数 III
 */

// @lc code=start
class Solution {
    public int longestOnes(int[] A, int K) {
        int ans = 0;
        int n = A.length , right = 0 , left = 0 , sum = 0;
        while(right < n){
            sum += A[right++];
            ans = Math.max( ans , sum );
            while( (right - left) > ( ans + K) ){
                sum -= A[left++];
            }
        }
        return ans + K;
    }
}
// @lc code=end

