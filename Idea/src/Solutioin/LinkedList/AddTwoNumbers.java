/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: AddTwoNumbers
 * Author:   CS
 * Date:     2021/3/16 10:16
 * Description: 两数之和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈两数之和〉
 *
 * @author CS
 * @create 2021/3/16
 * @since 1.0.0
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        int carry = 0;
        while ( l1 != null || l2 != null ) {
            int tmpSum = 0;
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            tmpSum = ( val1 + val2 + carry );
            cur.next = new ListNode(tmpSum % 10);
            cur = cur.next;
            carry = tmpSum / 10;
            if ( l1 != null ) {
                l1 = l1.next;
            }
            if ( l2 != null ) {
                l2 = l2.next;
            }
        }
        if ( carry != 0 ) {
            cur.next = new ListNode(carry);
        }
        return head.next;
    }

    public static void main(String[] args) {

    }
}
