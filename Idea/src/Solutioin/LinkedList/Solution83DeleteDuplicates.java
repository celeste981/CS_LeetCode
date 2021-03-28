/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution83DeleteDuplicates
 * Author:   CS
 * Date:     2021/3/26 8:27
 * Description: 删除排序链表中的重复元素
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈删除排序链表中的重复元素〉
 *
 * @author CS
 * @create 2021/3/26
 * @since 1.0.0
 */
public class Solution83DeleteDuplicates {

//    public ListNode deleteDuplicates ( ListNode head ) {
//        ListNode dummy = new ListNode( 0 , head ) , preTail = dummy , cur = head;
//        while ( cur != null ) {
//            if ( cur.next != null && cur.val == cur.next.val ) {
//                ListNode preNode = cur;
//                int curVal = cur.val;
//                while ( cur != null && cur.val == curVal ) {
//                    preNode = cur;
//                    cur = cur.next;
//                }
//                preTail.next = preNode;
//            } else {
//                cur = cur.next;
//                preTail = preTail.next;
//            }
//        }
//        return dummy.next;
//    }

    public ListNode deleteDuplicates(ListNode head) {
//        ListNode dummy = new ListNode( 0 , head ) ;
        ListNode preTail = head , cur = head;
        while ( cur != null ) {
            if ( cur.next != null && cur.val == cur.next.val ) {
                while ( cur.next != null && cur.val == cur.next.val ){
                    cur = cur.next;
                }
                preTail.next = cur;
            } else {
                cur = cur.next;
                preTail = preTail.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
