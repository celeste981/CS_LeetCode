/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution25
 * Author:   Administrator
 * Date:     2021/3/8 10:16
 * Description: K个一组反转链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈K个一组反转链表〉
 *
 * @author Administrator
 * @create 2021/3/8
 * @since 1.0.0
 */
public class Solution25 {

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

    public ListNode reverseKGroup(ListNode head , int k) {
        if (head == null) {
            return null;
        }
        ListNode a , b;
        a = head; b = head;
        for (int i = 0 ; i < k ; i++ ) {
            //不足k不需要反转
            if (b == null ) {
                return head;
            }
            b = b.next;
        }
        //反转前K个元素
        ListNode newHead = reverseGroup(a , b);
        //递归反转后续链表并连接起来
        a.next = reverseKGroup(b , k);
        return newHead;
    }

    //反转区间[a , b)的元素，左闭右开
    public ListNode reverseGroup(ListNode a , ListNode b) {
        ListNode pre = a , cur = a.next , nxt = a.next;
        while (cur != b) {
            //保存未反转序列
            nxt = cur.next;

            //反转当前结点
            cur.next = pre;

            //移动pre和cur
            pre = cur;
            cur = nxt;
        }
        return pre;
    }

    public ListNode reversAll(ListNode head ) {
        //nxt保存即将反转的序列，cur和pre来实现反转
        ListNode pre , cur , nxt ;
        pre = null ; cur = head ; nxt = head;
        while (cur != null) {
            //逆序单个插入节点
            //nxt先保存即将反转的序列
            nxt = cur.next;

            //逐个结点反转
            cur.next = pre;

            //单个节点反转完成
            // 更新cur和pre
            pre = cur;
            cur = nxt;

        }
        return pre;
    }

    public void Print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution25 solution25 = new Solution25();
        ListNode head = new ListNode(1 , null);
        ListNode point = head;
        for (int i = 2 ; i < 6 ; i++ ) {
            ListNode temp = new ListNode(i);
            point.next = temp;
            point = point.next;
        }
//        head = solution25.reversAll(head);
//        solution25.Print(head);
        head = solution25.reverseKGroup(head , 3);
        solution25.Print(head);
    }
}
