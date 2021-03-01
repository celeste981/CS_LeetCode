/*
 * @lc app=leetcode.cn id=628 lang=java
 *
 * [628] 三个数的最大乘积
 */


class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max1 = nums[n-1] * nums[n-2] * nums[n-3];
        int max2 = nums[n-1] * nums[0] * nums[1];
        return n = max1 > max2 ? max1 : max2 ;
    }
}

// @lc code=start
class Solution {
    public int maximumProduct(int[] nums) {
        //min
        int min1 = Integer.MAX_VALUE , min2 = Integer.MAX_VALUE;
        //max
        int max1 = Integer.MIN_VALUE , max2 = Integer.MIN_VALUE , max3 = Integer.MIN_VALUE;
        
        for(int x : nums){
            if(x > max1){
                max3 = max2;
                max2 = max1;
                max1 = x;
            }
            else if( x > max2){
                max3 = max2;
                max2 = x;
            }
            else if(x > max3){
                max3 = x;
            }

            if(x < min1){
                min2 = min1;
                min1 = x;
            }
            else if( x < min2){
                min2 = x;
            }

        }
        return Math.max(max1 * max2 * max3 , min1 * min2 * max1);
    }
}
// @lc code=end