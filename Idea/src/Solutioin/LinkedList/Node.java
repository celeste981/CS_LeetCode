/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Node
 * Author:   CS
 * Date:     2021/3/16 21:02
 * Description: 链表Node节点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈链表Node节点〉
 *
 * @author CS
 * @create 2021/3/16
 * @since 1.0.0
 */
public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
    public Node random;
    public Node() {}
    //随机指针
    public Node(int val , Node _next , Node _random ) {
        this.val = val;
        this.next = _next;
        this.random = _random;
    }
    Node ( int val , Node prev , Node next , Node child ) {
        this.val = val;
        this.prev = prev;
        this.next = next;
        this.child = child;
    }

    public static void main(String[] args) {
        Node root = new Node( 1 , null ,  null , null );
        Node r = new Node( 2 , root ,  null , null );
        Node rr = new Node( 5 , r ,  null , null );
        Node rl = new Node( 3 , null ,  null , null );
        Node rlr = new Node( 4 , rl ,  null , null );
        root.next = r;
        r.next = rr;    r.child = rl;
        rl.next = rlr;
    }
}
