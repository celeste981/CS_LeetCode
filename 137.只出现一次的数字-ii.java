/*
 * @lc app=leetcode.cn id=137 lang=java
 *
 * [137] 只出现一次的数字 II
 */


class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer , Interger> map = new HashMap<>();
        for(Integer num : nums){
            Integer count = map.get(num);
            count = count == null ?
                    1 : ++count;
            map.put(num , count);
        }
        for(Integer num : nums){
            if(map.get(num) == 1){
                return num;
            }
        }
        return -1;
    }
}

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        Set<Long> set = new HashSet<>();
        long sumSet = 0 , sumArray = 0;
        for(int num : nums ){
            sumArray = sumArray + num ;
            set.add((long)num);
        }
        for(long temp : set){
            sumSet = sumSet + temp;
        }
        return (int)((3 * sumSet - sumArray) / 2);
    }
}
// @lc code=end