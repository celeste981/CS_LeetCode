/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: RemoveElements
 * Author:   Administrator
 * Date:     2021/3/15 10:42
 * Description: 移除链表元素
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈移除链表元素〉
 *
 * @author Administrator
 * @create 2021/3/15
 * @since 1.0.0
 */
public class RemoveElements {

    public ListNode removeElements ( ListNode head , int val ) {
        ListNode dummy = new ListNode(0 , head ) , pre = dummy ,  cur = head;
        while ( cur != null ) {
            if ( cur.val == val ) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = pre.next;
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveElements removeElements = new RemoveElements();
    }
}
