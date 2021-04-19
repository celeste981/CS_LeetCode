/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: SwapPairs
 * Author:   CS
 * Date:     2021/3/24 17:16
 * Description: 两两交换链表中的节点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DepthFirstSearch.Recursion;

/**
 * 〈一句话功能简述〉<br> 
 * 〈两两交换链表中的节点〉
 *
 * @author CS
 * @create 2021/3/24
 * @since 1.0.0
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if ( head == null || head.next == null) {
            return head;
        }
        head.next.next = swapPairs(head.next.next);
        head.next = head.next.next;
        head.next.next = head;
        return head;
    }

    public static void main(String[] args) {

    }
}
