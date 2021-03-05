/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution503
 * Author:   CS
 * Date:     2021/3/6 0:10
 * Description: 下一个更大元素||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈下一个更大元素||〉
 *
 * @author CS
 * @create 2021/3/6
 * @since 1.0.0
 */
public class Solution503 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        Arrays.fill(ret, -1);
        Deque<Integer> stack = new LinkedList<Integer>();
        for (int i = 0; i < n * 2 - 1; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                ret[stack.pop()] = nums[i % n];
            }
            stack.push(i % n);
        }
        return ret;
    }
    public static void main(String[] args) {

    }
}
