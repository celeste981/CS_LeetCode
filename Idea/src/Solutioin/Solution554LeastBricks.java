/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution554LeastBricks
 * Author:   CS
 * Date:     2021/5/2 17:10
 * Description: 砖墙
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈砖墙〉
 *
 * @author CS
 * @create 2021/5/2
 * @since 1.0.0
 */
public class Solution554LeastBricks {

    public int leastBricks(List<List<Integer>> wall) {
        int ans = 0;
        int n = wall.size();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, sum = 0; i < n; i++, sum = 0) {
            for (int num : wall.get(i)) {
                sum += num;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            map.remove(sum);
        }
        for (int gap : map.keySet()) {
            int gapCnt = map.get(gap);
            ans = Math.max(ans, gapCnt);
        }
        return n - ans;
    }

    public static void main(String[] args) {

    }
}
