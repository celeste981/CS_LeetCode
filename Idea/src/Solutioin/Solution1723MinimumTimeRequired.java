/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution1723MinimumTimeRequired
 * Author:   CS
 * Date:     2021/5/8 9:25
 * Description: 完成所有工作的最短时间
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈完成所有工作的最短时间〉
 *
 * @author CS
 * @create 2021/5/8
 * @since 1.0.0
 */
public class Solution1723MinimumTimeRequired {

    int[] jobs;

    public int minimumTimeRequired(int[] jobs, int k) {
        this.jobs = jobs;
        Arrays.sort(jobs);
        int left = 0, right = 0;
        for (int job : jobs) {
            left = Math.max(left, job);
            right += job;
        }
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (check(mid, k)) {
                // 每个人派出的任务太少
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public boolean check(int maxTime, int k) {
        System.out.println(Arrays.toString(jobs));
        int cnt = 1;
        int tmp = 0;
        for (int job : jobs) {
            tmp += job;
            if (tmp > maxTime) {
                cnt++;
                tmp = job;
            }
        }
        return cnt > k;
    }

    public static void main(String[] args) {
        Solution1723MinimumTimeRequired solution1723MinimumTimeRequired = new Solution1723MinimumTimeRequired();
        // 3,2,3        3
        // 1,2,4,7,8    2
        int[] jobs = new int[]{1,2,4,7,8};
        System.out.println(solution1723MinimumTimeRequired.minimumTimeRequired(jobs, 2));
    }
}
