/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: ListNode
 * Author:   CS
 * Date:     2021/3/14 17:18
 * Description: 链表节点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈链表节点〉
 *
 * @author CS
 * @create 2021/3/14
 * @since 1.0.0
 */
public class ListNode {
        int val;
        ListNode next;
        ListNode prev;
        ListNode() {}
        ListNode(int x) { val = x; }
        ListNode(int x , ListNode next) {
                val = x;
                this.next = next;
        }
}
