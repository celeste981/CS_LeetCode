/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: CloneGraph
 * Author:   CS
 * Date:     2021/3/21 16:21
 * Description: 无向图的克隆
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈无向图的克隆〉
 *
 * @author CS
 * @create 2021/3/21
 * @since 1.0.0
 */
public class Solution133CloneGraph {

    private HashMap < Node , Node > visited = new HashMap<>();

//    public Node cloneGraphDFS(Node node) {
//        if ( node == null ) {
//            return null;
//        }
//        if ( visited.containsKey( node ) ) {
//            return visited.get( node );
//        }
//
//        Node cloneNode = new Node( node.val , new ArrayList<>() );
//        visited.put( node , cloneNode ) ;
//        for ( Node neighbor : node.neighbors ) {
//            cloneNode.neighbors.add( cloneGraphDFS(neighbor) );
//        }
//        return cloneNode;
//    }

    public Node cloneGraphBFS(Node node) {
        if ( node == null ) {
            return null;
        }
        Deque< Node > queue = new LinkedList<>();
        Node cloneRoot = new Node( node.val , new ArrayList<>() );
        visited.put( node , cloneRoot );
        queue.offer( node );
        while ( !queue.isEmpty() ) {
            Node cur = queue.poll();
            for ( Node neighbor : cur.neighbors ) {
                if ( !visited.containsKey( neighbor ) ){
                    Node cloneNode = new Node( neighbor.val , new ArrayList<>() );
                    visited.put( neighbor , cloneNode );
                    queue.offer( neighbor );
                }
                visited.get( cur ).neighbors.add( visited.get(neighbor) );
            }
        }
        return cloneRoot;
    }

    public static void main(String[] args) {

    }
}
