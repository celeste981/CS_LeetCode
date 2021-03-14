/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: HasCycle
 * Author:   CS
 * Date:     2021/3/14 22:24
 * Description: 环形链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈环形链表〉
 *
 * @author CS
 * @create 2021/3/14
 * @since 1.0.0
 */
public class HasCycle {
    public boolean hasCycle (ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while ( fast != slow ) {
            if (fast == null || fast.next == null ) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
