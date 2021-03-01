import java.util.List;

/*
 * @lc app=leetcode.cn id=1018 lang=java
 *
 * [1018] 可被 5 整除的二进制前缀
 */

// @lc code=start
class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<Boolean>();
        int prefix = 0 ;
        int length = A.length;
        for(int i = 0 ; i < length ; i++){
            prefix = ((prefix << 1) + A[i]) % 5;
            //存储Boolean值即可
            list.add(prefix == 0);
        }
        return list;
    }
}
// @lc code=end

