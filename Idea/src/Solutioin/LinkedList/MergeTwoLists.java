/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: MergeTwoLists
 * Author:   CS
 * Date:     2021/3/16 8:43
 * Description: 合并两个有序链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈合并两个有序链表〉
 *
 * @author CS
 * @create 2021/3/16
 * @since 1.0.0
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if ( l1 == null || l2 == null ) {
            return l1 == null ? l2 : l1;
        }
        ListNode newHead = new ListNode(0);
        ListNode cur = newHead;
        while ( l1 != null && l2 != null ) {
            if ( l1.val < l2.val ) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        return newHead.next;
    }

    public static void main(String[] args) {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
    }
}
