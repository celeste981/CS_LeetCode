/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution92ReverseBetween
 * Author:   Administrator
 * Date:     2021/3/18 9:02
 * Description: 反转链表||
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

import Solutioin.BinaryTree.Solution111;

/**
 * 〈一句话功能简述〉<br> 
 * 〈反转链表||〉
 *
 * @author Administrator
 * @create 2021/3/18
 * @since 1.0.0
 */
public class Solution92ReverseBetween {

//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        if ( head == null ) {
//            return head;
//        }
//        ListNode dummy = new ListNode( 0 , head ) ;
//        ListNode preHead = dummy , bef = dummy ;
//        int len = right - left + 1 ;
//        while ( left > 1 && preHead != null ) {
//            preHead = preHead.next;
//            left--;
//        }
//        bef = preHead;  preHead = preHead.next;
//        ListNode postHead = head;
//        while ( right > 0 && postHead != null ) {
//            postHead = postHead.next;
//            right--;
//        }
//        ListNode curReverse = preHead , next = preHead;
//        while ( len > 0 && curReverse != null ) {
//            //保存未反转节点
//            next = curReverse.next;
//
//            //反转单个节点
//            curReverse.next = postHead;
//
//            //更新尾部 和待交换节点
//            postHead = curReverse;
//            curReverse = next;
//            len--;
//        }
//        bef.next = postHead;
//        return dummy.next;
//    }


    public ListNode reverseBetween(ListNode head, int left, int right){
        if ( head == null || left == right ) {
            return head;
        }
        int len = right - left;
        ListNode dummy = new ListNode( 0 , head );
        ListNode preHead = dummy , preTail = dummy ;
        while ( left > 1 && preHead != null ) {
            preHead = preHead.next;
            left--;
        }
        preTail = preHead ;
        preHead = preHead.next;
        ListNode curReverse = preHead.next , next = curReverse;
        ListNode postHead = preHead;
        while ( len > 0 && curReverse != null ) {
            //保存未反转节点
            next = curReverse.next;
            //用postHead接住未反转部分
            postHead.next = next;

            //反转单个节点
            curReverse.next = preHead;

            //更新preHead和curReverse
            preHead = curReverse;
            curReverse = next;
            len--;
        }
        preTail.next = preHead;
        return dummy.next;
    }

    public static void Print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution92ReverseBetween solution92ReverseBetween = new Solution92ReverseBetween();
        ListNode head = new ListNode(1 , null);
        ListNode point = head;
        for (int i = 2 ; i < 6 ; i++ ) {
            ListNode temp = new ListNode(i);
            point.next = temp;
            point = point.next;
        }
        //Print(head);
        Print(solution92ReverseBetween.reverseBetween(head , 1, 2 ));
    }
}
