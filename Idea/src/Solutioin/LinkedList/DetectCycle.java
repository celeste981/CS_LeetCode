/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: DetectCycle
 * Author:   CS
 * Date:     2021/3/14 22:44
 * Description: 环形链表||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈环形链表||〉
 *
 * @author CS
 * @create 2021/3/14
 * @since 1.0.0
 */
public class DetectCycle {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            if (fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            if ( fast == slow ) {
                ListNode cur = head;
                while ( cur != slow ) {
                    cur = cur.next;
                    slow = slow.next;
                }
            }
        }
        return slow;
    }

    public static void main(String[] args) {

    }
}
