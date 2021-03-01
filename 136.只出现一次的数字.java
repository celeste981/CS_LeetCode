/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

 /*
    1.任何数和0做异或运算，结果仍是原来的数；
    2.任何数和其自身做异或运算，结果是0；
    3.异或运算满足交换律和结合律。
  */

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0 ;
        for(int num : nums){
            ans = ans ^ num;
        } 
        return ans;
    }
}

// @lc code=start


/*
    创建hashmap
    返回 value 为 1 的 key
*/
class Solution {
    public int singleNumber(int[] nums){
        Map<Integer , Integer> map = new HashMap<>();
        for(Integer i : nums){
            Integer count = map.get(i);
            count = count == null ? 1 : ++count;
            map.put(i,count);
        }
        for(Integer i : nums){
            if(map.get(i) == 1){
                return i;
            }
        }
        return -1;
    }
}

// @lc code=end