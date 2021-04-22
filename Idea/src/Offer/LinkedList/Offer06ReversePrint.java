/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Offer06ReversePrint
 * Author:   CS
 * Date:     2021/4/20 10:07
 * Description: 从尾到头打印链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Offer.LinkedList;

import java.util.Arrays;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈从尾到头打印链表〉
 *
 * @author CS
 * @create 2021/4/20
 * @since 1.0.0
 */
public class Offer06ReversePrint {

    public int[] reversePrint ( ListNode head ) {
        int len = 0;
        ListNode cur = head;
        while ( cur != null ) {
            len++;
            cur = cur.next;
        }
        int[] ans = new int[len];
        len--;
        while ( head != null ) {
            ans[len--] = head.val;
            head = head.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;
        Offer06ReversePrint offer06ReversePrint = new Offer06ReversePrint();
        System.out.println(Arrays.toString(offer06ReversePrint.reversePrint(listNode1)));
    }
}
