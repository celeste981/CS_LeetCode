/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer45MinNumber
 * Author:   CS
 * Date:     2021/5/13 10:02
 * Description: 把数组排成最小的数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈把数组排成最小的数〉
 *
 * @author CS
 * @create 2021/5/13
 * @since 1.0.0
 */
public class Offer45MinNumber {

    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        quickSort(strs, 0, nums.length - 1);
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }

    public void quickSort(String[] strs, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int p = partition(strs, lo, hi);
        quickSort(strs, lo, p - 1);
        quickSort(strs, p + 1, hi);
    }

    public int partition(String[] strs, int lo, int hi) {
        if (lo >= hi) {
            return lo;
        }
        String pivot = strs[lo];
        int i = lo, j = hi + 1;
        while (true) {
            while ((strs[++i] + pivot).compareTo(pivot + strs[i]) < 0) {
                if (i == hi) {
                    break;
                }
            }
            while ((strs[--j] + pivot).compareTo(pivot + strs[j]) > 0) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(strs, i, j);
        }
        swap(strs, lo, j);
        return j;
    }

    public void swap(String[] strs, int i, int j) {
        String temp = strs[i];
        strs[i] = strs[j];
        strs[j] = temp;
    }

    public static void main(String[] args) {
        Offer45MinNumber offer45MinNumber = new Offer45MinNumber();
        // 3,30,34,5,9
        // 2,1
        int[] nums = new int[]{2,1};
        System.out.println(offer45MinNumber.minNumber(nums));
    }
}
