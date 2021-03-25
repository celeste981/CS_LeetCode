/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution82
 * Author:   CS
 * Date:     2021/3/25 8:44
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
 * @create 2021/3/25
 * @since 1.0.0
 */
public class Solution82DeleteDuplicates {

    public ListNode deleteDuplicates ( ListNode head ) {
        if ( head == null ) {
            return null;
        }
        ListNode dummy = new ListNode(0 , head);
        ListNode preTail = dummy , cur = head;
        while ( cur != null) {
            if ( cur.next != null && cur.val == cur.next.val ) {
                int curVal = cur.val;
                while ( cur != null && cur.val == curVal ) {
                    cur = cur.next;
                }
                preTail.next = cur;
            } else {
                preTail = preTail.next;
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Solution82DeleteDuplicates solution82DeleteDuplicates = new Solution82DeleteDuplicates();
    }
}
