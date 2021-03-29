/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution61RotateRight
 * Author:   CS
 * Date:     2021/3/19 22:43
 * Description: 旋转链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈旋转链表〉
 *
 * @author CS
 * @create 2021/3/19
 * @since 1.0.0
 */
public class Solution61RotateRight {

//    public ListNode rotateRight ( ListNode head , int k ) {
//        if ( head == null ) {
//            return head;
//        }
//        int n = 0;
//        ListNode cur = head;
//        while ( cur.next != null ) {
//            cur = cur.next;
//            n++;
//        }
//        n++;
//        cur.next = head;
//        if ( k == n ) {
//            return head;
//        }
//        k = k % n;
//        k = n - k;
//        while ( k != 1 ) {
//            head = head.next;
//            k--;
//        }
//        cur = head.next;
//        head.next = null;
//        return cur;
//    }

    public ListNode rotateRight(ListNode head, int k) {
        if ( head == null ) {
            return null;
        }
        ListNode dummy = new ListNode( 0 , head );
        ListNode cur = dummy;
        ListNode preTail = dummy;
        int n = 0;
        while ( cur.next != null ) {
            cur = cur.next;
            n++;
        }
        cur.next = head;
        k = k % n;
        int rest = n - k;
        while ( rest > 0 ) {
            preTail = preTail.next;
            rest--;
        }
        cur = preTail.next;
        preTail.next = null;
        return cur;
    }

    public static void main(String[] args) {
         Solution61RotateRight solution61RotateRight = new Solution61RotateRight();
         
    }
}
