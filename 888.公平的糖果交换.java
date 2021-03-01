/*
 * @lc app=leetcode.cn id=888 lang=java
 *
 * [888] 公平的糖果交换
 */

// @lc code=start
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] ans = new int[2];
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        Arrays.sort(A);
        Arrays.sort(B);
        // Arrays.stream(A).sorted();
        // Arrays.stream(B).sorted();
//        int n1 = A.length;
//        int n2 = B.length;
        for(int i = 0 , j = 0 ; i < A.length && j < B.length ;){
            if((A[i] - B[j]) == (sumA - sumB) / 2){
                ans[0] = A[i];
                ans[1] = B[j];
                break;
            }
            else if((A[i] - B[j]) > (sumA - sumB) / 2){
                j++;
            }
            else if((A[i] - B[j]) < (sumA - sumB) / 2){
                i++;
            }
        }
        return ans;
    }
}
// @lc code=end

