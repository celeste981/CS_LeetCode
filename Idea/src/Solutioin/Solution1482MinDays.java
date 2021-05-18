/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1482MinDays
 * Author:   CS
 * Date:     2021/5/9 20:20
 * Description: 制作M
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈制作m束花所需的最少天数〉
 *
 * @author CS
 * @create 2021/5/9
 * @since 1.0.0
 */
public class Solution1482MinDays {

    public int minDays(int[] bloomDay, int m, int k) {
        int left = Arrays.stream(bloomDay).min().getAsInt();
        int right = Arrays.stream(bloomDay).max().getAsInt();
        if (bloomDay.length < m * k) {
            return -1;
        }
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (check(bloomDay, m, k, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean check(int[] days, int m, int k, int mid) {
        int cnt = 0;
        boolean[] tmp = new boolean[days.length];
        for (int i = 0; i < days.length; i++) {
            if (mid >= days[i]) {
                tmp[i] = true;
            }
        }
        int cur = 0;
        boolean flag = false;
        for (int i = 0; i < days.length; i++) {
            while (i < days.length && tmp[i]) {
                flag = true;
                cur++;
                i++;
                if (cur == k) {
                    // 包装的花束++
                    cnt++;
                    // 清空当前连续值的计数
                    cur = 0;
                }
            }
            if (flag) {
                flag = false;
            }
            cur = 0;
        }
        return cnt >= m;
    }

    public static void main(String[] args) {
        Solution1482MinDays solution1482MinDays = new Solution1482MinDays();
        // 1,10,3,10,2              3,1
        // 1,10,3,10,2              3,2
        // 7,7,7,7,12,7,7           2,3
        // 1000000000,1000000000    1,1
        // 1,10,2,9,3,8,4,7,5,6     4,2
        int[] bloomDay = new int[]{1,10,2,9,3,8,4,7,5,6};
        System.out.println(solution1482MinDays.minDays(bloomDay, 4, 2));
    }
}
