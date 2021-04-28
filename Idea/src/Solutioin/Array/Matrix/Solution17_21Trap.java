/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution17_21Trap
 * Author:   CS
 * Date:     2021/4/2 8:47
 * Description: 直方图的水量
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Array.Matrix;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈直方图的水量〉
 *
 * @author CS
 * @create 2021/4/2
 * @since 1.0.0
 */
public class Solution17_21Trap {

    public int trap ( int[] height ) {
        int ans = 0;
        int left = 0 , right = height.length - 1;
        int leftMax = 0 , rightMax = 0;
        while ( left < right ) {
            if ( height[left] < height[right] ) {
                if ( height[left] >= leftMax ) {
                    leftMax = height[left];
                } else {
                    ans += ( leftMax - height[left] );
                }
                left++;
            } else {
                if ( height[right] > rightMax ) {
                    rightMax = height[right];
                } else {
                    ans += ( rightMax - height[right]);
                }
                right--;
            }
        }
        return ans;
    }

    public int trap2(int[] height) {
        int ans = 0, current = 0;
        Deque<Integer> stack = new LinkedList<Integer>();
        while (current < height.length) {
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty())
                    break;
                int distance = current - stack.peek() - 1;
                int bounded_height = Math.min(height[current], height[stack.peek()]) - height[top];
                ans += distance * bounded_height;
            }
            stack.push(current++);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution17_21Trap solution17_21Trap = new Solution17_21Trap();
        System.out.println(solution17_21Trap.trap2( new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
