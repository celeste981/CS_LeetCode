/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer24ReverseList
 * Author:   CS
 * Date:     2021/4/22 12:39
 * Description: 反转链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈反转链表〉
 *
 * @author CS
 * @create 2021/4/22
 * @since 1.0.0
 */
public class Offer24ReverseList {

    public ListNode reverseList ( ListNode head ) {
        //迭代反转
//        ListNode dummy = new ListNode( 0 );
        ListNode cur = head;
        ListNode pre = null;
        while ( cur != null ) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {

    }
}
