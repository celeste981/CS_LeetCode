/*
 * @lc app=leetcode.cn id=724 lang=java
 *
 * [724] 寻找数组的中心索引
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        if(0 == nums.length){
            return -1;
        }
        int sum = 0;
        int temp = 0;
        for(int num : nums){
            sum += num;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if( sum == 2 * temp + nums[i] ){
                return i;
            }
            temp += nums[i];
        }
        return -1;
    }
}
// @lc code=end

