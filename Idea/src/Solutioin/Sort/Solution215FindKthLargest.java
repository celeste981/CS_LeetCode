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

import java.lang.reflect.Array;
import java.util.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈数组中的第K个最大元素〉
 *
 * @author CS
 * @create 2021/5/13
 * @since 1.0.0
 */
public class Solution215FindKthLargest {

//    // 快速排序
//    public int findKthLargest(int[] nums, int k) {
//        // k 表示是第几，而快排返回的是数组下标，所以在最开始 k--
//        k--;
//        shuffle(nums);
//        System.out.println("随机打乱后的数组为：" + Arrays.toString(nums));
//        int left = 0, right = nums.length - 1;
//        while (left <= right) {
//            int p = partition(nums, left, right);
//            if (p < k) {
//                left = p + 1;
//            } else if (p > k) {
//                right = p - 1;
//            } else {
//                return nums[p];
//            }
//        }
//        return -1;
//    }
//
//    void shuffle(int[] nums) {
//        int n = nums.length;
//        Random rand = new Random();
//        for (int i = 0; i < n; i++) {
//            // 从 i 到最后随机选一个元素
//            int r = i + rand.nextInt(n - i);
//            swap(nums, i, r);
//        }
////        System.out.println(Arrays.toString(nums));
//    }
//
//    public int partition(int[] nums, int lo, int hi) {
//        if (lo >= hi) {
//            return lo;
//        }
//        int pivot = nums[lo];
//        int i = lo, j = hi + 1;
//        while (true) {
//            while (nums[++i] > pivot) {
//                if (i == hi) {
//                    break;
//                }
//            }
//            while (nums[--j] < pivot) {
//                if (j == lo) {
//                    break;
//                }
//            }
//            if (i >= j) {
//                break;
//            }
//            swap(nums, i, j);
//        }
//        swap(nums, j, lo);
//        return j;
//    }
//
//    public void swap(int[] nums, int i, int j) {
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }

    /**
     * 堆排序
     * 时间复杂度：
     * 建堆时间 O(n)，删除元素时间 O(klogn)，k < n
     * 总时间复杂度 O(nlogn)
     * 空间复杂度：
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(
//                new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        }
        );
        int n = nums.length;
        // 创建了一个小根堆
        for (int i = 0; i < k; i++) {
            priorityQueue.offer(nums[i]);
        }
        for (int i = k; i < n; i++) {
            int topMin = priorityQueue.peek();
            if (nums[i] > topMin) {
                priorityQueue.poll();
                priorityQueue.offer(nums[i]);
            }
        }
        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        Solution215FindKthLargest solution215FindKthLargest = new Solution215FindKthLargest();
        // 3,2,1,5,6,4  2
        int[] nums = new int[]{3,2,1,5,6,4};
        System.out.println("原数组为：" + Arrays.toString(nums));
        System.out.println(solution215FindKthLargest.findKthLargest(nums, 2));
    }
}
