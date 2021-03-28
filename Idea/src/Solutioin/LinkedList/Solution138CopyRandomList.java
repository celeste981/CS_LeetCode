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

    //    public Node cloneGraphBFS(Node node) {
//        if ( node == null ) {
//            return null;
//        }
//        Deque< Node > queue = new LinkedList<>();
//        Node cloneRoot = new Node( node.val , new ArrayList<>() );
//        visited.put( node , cloneRoot );
//        queue.offer( node );
//        while ( !queue.isEmpty() ) {
//            Node cur = queue.poll();
//            for ( Node neighbor : cur.neighbors ) {
//                if ( !visited.containsKey( neighbor ) ){
//                    Node cloneNode = new Node( neighbor.val , new ArrayList<>() );
//                    visited.put( neighbor , cloneNode );
//                    queue.offer( neighbor );
//                }
//                visited.get( cur ).neighbors.add( visited.get(neighbor) );
//            }
//        }
//        return cloneRoot;
//    }

    public Node copyRandomBFSList(Node head) {
        if ( head == null ) {
            return null;
        }

        Deque< Node > queue = new LinkedList<>();
        Node cloneHead = new Node( head.val , null , null );
        visited.put( head , cloneHead );
        queue.offer( cloneHead );
        while ( !queue.isEmpty() ) {
            Node cur = queue.poll();
            if ( !visited.containsKey(cur.next) && cur.next != null ){
                visited.get( cur ).next = new Node( cur.next.val , null , null );
                visited.put( cur.next , visited.get( cur ).next );
                queue.offer( visited.get( cur ).next);
            } else {
                visited.get( cur ).next = visited.get( cur.next );
            }
            if ( !visited.containsKey( cur.random) && cur.random != null ){
                visited.get( cur ).random = new Node( cur.random.val, null , null );
                visited.put( cur.random , visited.get( cur ).random );
                queue.offer( visited.get( cur ).random);
            } else {
                visited.get( cur ).random = visited.get( cur.random );
            }
        }
        return cloneHead;
    }

    public static void main(String[] args) {

    }

}
