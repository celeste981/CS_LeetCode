/*
 * @lc app=leetcode.cn id=674 lang=java
 *
 * [674] 最长连续递增序列
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if(0 == n){
            return 0;
        }
        int count = 1 , maxCount = 1;
        int curBegin = 0 ,maxBegin = 0 , end = 0;
        for(int i = 1 ; i < n ; i++){
            if(nums[i] > nums[i-1]){
                end = i;
                count++;
                if(count >= maxCount){
                    maxBegin = curBegin;
                    maxCount = count;
                }
            }
            else{
                curBegin = i;
                count = 1;
            }
        }
        return maxCount;
    }
}
// @lc code=end

