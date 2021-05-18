/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer57_2FindContinuousSequence
 * Author:   CS
 * Date:     2021/5/14 10:20
 * Description: 和为
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈和为s的连续正数序列〉
 *
 * @author CS
 * @create 2021/5/14
 * @since 1.0.0
 */
public class Offer57_2FindContinuousSequence {

    public int[][] findContinuousSequence(int target) {
        List<int[]> ans = new ArrayList<>();
        int start = (target + 1) / 2;
        int end = start;
        int curSum = 0;
        while (end >= 1) {
            if (curSum < target) {
                // 左边界向左移动
                curSum += start;
                start--;
            } else if (curSum > target) {
                // 右边界向左移动
                curSum -= end;
                end--;
            } else {
                int[] curArr = new int[end - start];
                for (int i = end; i > start; i--) {
                    curArr[end - i] = i;
                }
                ans.add(curArr);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {

    }
}
