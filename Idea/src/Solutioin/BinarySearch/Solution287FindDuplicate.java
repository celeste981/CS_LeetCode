/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution287FindDuplicate
 * Author:   CS
 * Date:     2021/4/8 10:58
 * Description: 寻找重复数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinarySearch;

/**
 * 〈一句话功能简述〉<br> 
 * 〈寻找重复数〉
 *
 * @author CS
 * @create 2021/4/8
 * @since 1.0.0
 */
public class Solution287FindDuplicate {

    public int findDuplicate ( int[] nums ) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        Solution287FindDuplicate solution287FindDuplicate = new Solution287FindDuplicate();
        int[] nums = new int[]{ 1,3,4,2,2 };
        System.out.println(solution287FindDuplicate.findDuplicate( nums ));
    }
}
