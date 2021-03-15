/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution206
 * Author:   Administrator
 * Date:     2021/3/8 15:46
 * Description: 反转链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;


/**
 * 〈一句话功能简述〉<br> 
 * 〈反转链表〉
 *
 * @author Administrator
 * @create 2021/3/8
 * @since 1.0.0
 */
public class Solution206 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val , ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

//    public ListNode reverseList(ListNode head) {
//        ListNode pre = null , cur = head , nxt = head;
//        while (cur != null) {
//            nxt = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = nxt;
//        }
//        return pre;
//    }

//    public ListNode reverseList(ListNode head) {
//        return reverse(null , head);
//    }
//
//    public ListNode reverse(ListNode pre , ListNode cur) {
//        if (cur == null) {
//            return pre;
//        }
//        ListNode temp = cur.next;
//        cur.next = pre;
//        return reverse(cur , temp);
//    }


    public ListNode reverseList(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    public static void main(String[] args) {
        Solution206 solution206 = new Solution206();

    }
}
