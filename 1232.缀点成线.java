import jdk.nashorn.internal.runtime.CodeInstaller;

/*
 * @lc app=leetcode.cn id=1232 lang=java
 *
 * [1232] 缀点成线
 */

// @lc code=start
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int deltaX = coordinates[0][0];
        int deltaY = coordinates[0][1];
        int n = coordinates.length;
        for(int i = 0 ; i < n ; i++){
            coordinates[i][0] = coordinates[i][0] - deltaX;
            coordinates[i][1] = coordinates[i][1] - deltaY;
        }

        return true;
    }
}
// @lc code=end

