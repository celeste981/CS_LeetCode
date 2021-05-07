/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer51ReversePairs
 * Author:   CS
 * Date:     2021/5/6 10:14
 * Description: 数组中的逆序对
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer;

/**
 * 〈一句话功能简述〉<br>
 * 〈数组中的逆序对〉
 *
 * @author CS
 * @create 2021/5/6
 * @since 1.0.0
 */
public class Offer51ReversePairs {

    int count;
    public int reversePairs(int[] nums) {
        this.count = 0;
        merge(nums, 0, nums.length - 1);
        return count;
    }

    public void merge(int[] nums, int left, int right) {
        //
        int mid = left + (right - left) / 2;
        if (left < right) {
            merge(nums, left, mid);
            merge(nums, mid + 1, right);
            mergeSort(nums, left, right, mid);
        }
    }

    public void mergeSort(int[] nums, int left, int right, int mid) {
        int[] tmpArr = new int[right - left + 1];
        int idx = 0;
        int temp1 = left, temp2 = mid + 1;
        while (temp1 <= mid && temp2 <= right) {
            if (nums[temp1] <= nums[temp2]) {
                tmpArr[idx++] = nums[temp1++];
            } else {
                // 用来统计逆序对的个数
                count += (mid + 1 - temp1);
                tmpArr[idx++] = nums[temp2++];
            }
        }
        // 把左边剩余的数移入数组
        while (temp1 <= mid) {
            tmpArr[idx++] = nums[temp1++];
        }
        // 把右边剩余的数移入数组
        while (temp2 <= right) {
            tmpArr[idx++] = nums[temp2++];
        }
        // 把新数组中的数覆盖nums数组
        for (int k = 0; k < tmpArr.length; k++) {
            nums[k + left] = tmpArr[k];
        }
    }

    public static void main(String[] args) {
        Offer51ReversePairs offer51ReversePairs = new Offer51ReversePairs();
        int[] nums = new int[]{7,5,6,4};
        System.out.println(offer51ReversePairs.reversePairs(nums));
    }
}
