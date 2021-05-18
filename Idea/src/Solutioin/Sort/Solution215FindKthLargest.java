/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution215FindKthLargest
 * Author:   CS
 * Date:     2021/5/13 20:48
 * Description: 数组中的第K个最大元素
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Sort;

import Solutioin.Solution1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br>
 * 〈数组中的第K个最大元素〉
 *
 * @author CS
 * @create 2021/5/13
 * @since 1.0.0
 */
public class Solution215FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
        shuffle(nums);
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int p = partition(nums, left, right);
            if (p < k) {
                left = p + 1;
            } else if (p > k) {
                right = p - 1;
            } else {
                return nums[p];
            }
        }
        return -1;
    }

    void shuffle(int[] nums) {
        int n = nums.length;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            // 从 i 到最后随机选一个元素
            int r = i + rand.nextInt(n - i);
            swap(nums, i, r);
        }
    }

    public int partition(int[] nums, int lo, int hi) {
        if (lo >= hi) {
            return lo;
        }
        int pivot = nums[lo];
        int i = lo, j = hi + 1;
        while (true) {
            while (nums[++i] > pivot) {
                if (i == hi) {
                    break;
                }
            }
            while (nums[--j] < pivot) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, j, lo);
        return j;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[j] = nums[i];
        nums[i] = temp;
        Set<Integer> set = new HashSet<>();
        set.ad
    }

    public static void main(String[] args) {
        Solution215FindKthLargest solution215FindKthLargest = new Solution215FindKthLargest();
        // 3,2,1,5,6,4  2
        int[] nums = new int[]{3,2,1,5,6,4};
        System.out.println(solution215FindKthLargest.findKthLargest(nums, 2));
    }
}
