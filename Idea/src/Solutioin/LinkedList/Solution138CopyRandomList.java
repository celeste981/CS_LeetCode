/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution138CopyRandomList
 * Author:   CS
 * Date:     2021/3/28 22:10
 * Description: 复制带随机指针的链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.LinkedList;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈复制带随机指针的链表〉
 *
 * @author CS
 * @create 2021/3/28
 * @since 1.0.0
 */
public class Solution138CopyRandomList {

    private HashMap< Node , Node > visited = new HashMap<>();

//    public Node copyRandomDFSList(Node head) {
//        if ( head == null ) {
//            return null;
//        }
//        if ( visited.containsKey( head ) ) {
//            return visited.get( head );
//        }
//
//        Node cloneNode = new Node( head.val , null , null );
//        visited.put( head , cloneNode );
//        cloneNode.next = copyRandomList( head.next );
//        cloneNode.random = copyRandomList( head.random );
//        return cloneNode;
//    }


    public Node copyRandomBFSList(Node head) {
        if ( head == null ) {
            return null;
        }

        Deque< Node > queue = new LinkedList<>();
        Node cloneHead = new Node( head.val , null , null );
        visited.put( head , cloneHead );
        queue.offer( head );
        while ( !queue.isEmpty() ) {
            Node cur = queue.poll();
            if ( cur.next != null ) {
                if ( !visited.containsKey(cur.next) ){
                    visited.get( cur ).next = new Node( cur.next.val , null , null );
                    visited.put( cur.next , visited.get( cur ).next );
                    queue.offer( cur.next);
                } else {
                    visited.get( cur ).next = visited.get( cur.next );
                }
            }
            if ( cur.random != null ) {
                if ( !visited.containsKey( cur.random) ){
                    visited.get( cur ).random = new Node( cur.random.val, null , null );
                    visited.put( cur.random , visited.get( cur ).random );
                    queue.offer( cur.random);
                } else {
                    visited.get( cur ).random = visited.get( cur.random );
                }
            }
        }
        return cloneHead;
    }

    public static void main(String[] args) {
        Solution138CopyRandomList solution138CopyRandomList = new Solution138CopyRandomList();
        Node node1 = new Node( 7 );
        Node node2 = new Node( 13 );
        Node node3 = new Node( 11 );
        Node node4 = new Node( 10 );
        Node node5 = new Node( 1 );
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        node1.random = null;
        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;
        solution138CopyRandomList.copyRandomBFSList(node1);
    }

}
