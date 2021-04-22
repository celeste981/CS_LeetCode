/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer22GetKthFromEnd
 * Author:   CS
 * Date:     2021/4/22 12:51
 * Description: 链表中倒数第k个节点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈链表中倒数第k个节点〉
 *
 * @author CS
 * @create 2021/4/22
 * @since 1.0.0
 */
public class Offer22GetKthFromEnd {

    public ListNode getKthFromEnd ( ListNode head , int k ) {
        ListNode fast = head ;
        ListNode slow = head ;
        while ( k > 0 ) {
            fast = fast.next;
            k--;
        }
        while ( fast != null ) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {

    }
}
