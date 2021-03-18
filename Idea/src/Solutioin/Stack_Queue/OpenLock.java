/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: OpenLock
 * Author:   Administrator
 * Date:     2021/3/17 16:43
 * Description: 打开转盘锁
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br> 
 * 〈打开转盘锁〉
 *
 * @author Administrator
 * @create 2021/3/17
 * @since 1.0.0
 */
public class OpenLock {

    public int openLock(String[] deadends, String target) {
        int ans = -1;
        Set<String> dead = new HashSet<>();
        for ( String s : deadends ) {
            dead.add(s);
        }
        Deque<String> queue = new LinkedList<>();
        queue.offer("0000");

        Set<String> seen = new HashSet<>();
        seen.add("0000");

        while ( !queue.isEmpty() ) {
            ans++;
            int size = queue.size();
            for ( int i = 0 ; i < size ; i++ ) {
                String node  = queue.poll();
                if ( node.equals(target) ) {
                    return ans;
                } else if ( !dead.contains(node) ){
                    for ( int j = 0 ; j < 4 ; j++ ) {
                        for ( int d = -1 ; d <= 1 ; d += 2 ) {
                            int change = ( (node.charAt(j) - '0') + d + 10) % 10;
                            String newNode = node.substring( 0 , j ) + ( ""+ change) + node.substring(j + 1);
                            if ( !seen.contains(newNode)) {
                                seen.add(newNode);
                                queue.offer(newNode);
                            }
                        }
                    }
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        OpenLock openLock = new OpenLock();
        System.out.println( openLock.openLock( new String[] { "0201","0101","0102","1212","2002"} , "0202" ));
    }
}
