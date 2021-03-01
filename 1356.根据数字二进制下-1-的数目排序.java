import java.lang.reflect.Array;

/*
 * @lc app=leetcode.cn id=1356 lang=java
 *
 * [1356] 根据数字二进制下 1 的数目排序
 */

// @lc code=start
class Solution {
    public int[] sortByBits(int[] arr) {
        int[] map = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            map[i] = Integer.bitCount(arr[i]) * 10000000 + arr[i];
        }
        Arrays.sort(map);
        for(int i = 0 ; i < map.length ; i++){
            map[i] = map[i] % 10000000;
        }
        return map;
    }
}
// @lc code=end

