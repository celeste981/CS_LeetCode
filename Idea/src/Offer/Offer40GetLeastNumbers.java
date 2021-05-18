/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer40GetLeastNumbers
 * Author:   CS
 * Date:     2021/5/11 21:54
 * Description: 最小的k个数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 〈一句话功能简述〉<br> 
 * 〈最小的k个数〉
 *
 * @author CS
 * @create 2021/5/11
 * @since 1.0.0
 */
public class Offer40GetLeastNumbers {

    public int[] getLeastNumbers(int[] arr, int k) {
        // 最大堆
        int[] ans = new int[k];
        if (k == 0) {
            return ans;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < k; i++) {
            queue.offer(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (queue.peek() > arr[i]) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            ans[i] = queue.poll();
        }
        return ans;
    }

//    public int[] getLeastNumbers(int[] arr, int k) {
//        // 快排思想
//        int[] ans = new int[k];
//        for (int i = 0; i < k; i++) {
//            ans[i] = arr[i];
//        }
//        return ans;
//    }

    public static void main(String[] args) {

    }
}
