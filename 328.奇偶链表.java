/*
 * @lc app=leetcode.cn id=328 lang=java
 *
 * [328] 奇偶链表
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode p  = head , q = head , m , n;
        // if(head.next == NULL || head.next == NULL){
        //     return head;
        // }
        while(q.next != null && q.next.next != null){
            m = p;
            p = p.next;
            n = q.next;
            q = q.next.next;
            swap(p , q , m , n);  
        }
        return head;
    }

    private void swap(ListNode p , ListNode q , ListNode m , ListNode n){
        n.next = q.next;
        m.next = q;
        q.next = p;
        p = m.next;
        q = n;
    }

}

// @lc code=start

class Solution{
    public ListNode oddEvenList(ListNode head) {
        ListNode p = new ListNode(0,null);
        ListNode q = new ListNode(0,null);
        ListNode m = new ListNode(0,null);
        ListNode n = new ListNode(0,null);

        p.next = m;
        q.next = n;
        if (head == null)
            return head;
        while(true)
        {
            if (head != null)
            {
                m = head;
                m = m.next;
                head = head.next;
            }
            else
                break;
            if (head != null)
            {
                n = head;
                n = n.next;
                head = head.next;
            }
            else    
                break;
        }
        m = q.next;
        head = p.next;
        return p.next;
    }
}

// @lc code=end

