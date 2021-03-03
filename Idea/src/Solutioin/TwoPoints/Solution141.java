/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution141
 * Author:   CS
 * Date:     2021/3/2 23:39
 * Description: 环形链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.TwoPoints;

/**
 * 〈一句话功能简述〉<br> 
 * 〈环形链表〉
 *
 * @author CS
 * @create 2021/3/2
 * @since 1.0.0
 */
public class Solution141 {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public boolean hasCycle(ListNode head) {
        //快慢指针
        //快指针走两步  慢指针走一步
        //若慢指针遇上快指针则说明有环
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while ( slow != fast) {
            if (fast == null || fast.next == null ) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution141 solution141 = new Solution141();

    }
}
