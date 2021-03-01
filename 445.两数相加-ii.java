/*
 * @lc app=leetcode.cn id=445 lang=java
 *
 * [445] 两数相加 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //要逆序处理数据，首先想到栈
            //1.放数进栈
            //2.结果链表
        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();

            //1.放数进栈
        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }

            //2.结果进链表
            //最后要用链表放结果
                //2.1 每次new一个cur结点  头插
                //2.2 cur.next就等于ans（当前结果）
                //2.3 ans每次都等于当前结果
        int carry = 0;
        ListNode ans = null;
        while( !s1.isEmpty() || !s2.isEmpty() || carry != 0 ){
            int n1 = s1.isEmpty() ? 0 : s1.pop();
            int n2 = s2.isEmpty() ? 0 : s2.pop();
            //这里先用carry的值，后改变carry
            ListNode cur = new ListNode( (n1 + n2 + carry) % 10 );
            carry = (n1 + n2 + carry) / 10;
            cur.next = ans;
            ans = cur;
        }
        return ans;
    }
}
// @lc code=end

