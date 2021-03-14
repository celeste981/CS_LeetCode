/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: GetIntersectionNode
 * Author:   CS
 * Date:     2021/3/14 23:09
 * Description: 相交链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈相交链表〉
 *
 * @author CS
 * @create 2021/3/14
 * @since 1.0.0
 */
public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA , b = headB;
        while ( a != b ){
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }

    public static void main(String[] args) {

    }
}
