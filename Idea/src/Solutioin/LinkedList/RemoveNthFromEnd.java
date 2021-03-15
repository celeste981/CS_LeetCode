/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: RemoveNthFromEnd
 * Author:   Administrator
 * Date:     2021/3/15 9:27
 * Description: 删除链表的倒数第N个节点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈删除链表的倒数第N个节点〉
 *
 * @author Administrator
 * @create 2021/3/15
 * @since 1.0.0
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head , int n) {
        ListNode fast = head ;
        ListNode dummy = new ListNode( 0 , head);
        ListNode slow = dummy;
        while ( n > 0 ) {
            fast = fast.next;
            n--;
        }
        while ( fast != null ){
            fast = fast.next;
            slow = slow.next;
        }
        //slow 为待删除节点的前一个
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
    }
}
