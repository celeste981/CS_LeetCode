/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution146LRUCache
 * Author:   CS
 * Date:     2021/3/29 10:26
 * Description: LRU缓存机制
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈LRU缓存机制〉
 *
 * @author CS
 * @create 2021/3/29
 * @since 1.0.0
 */
public class Solution146LRUCache extends LinkedHashMap< Integer , Integer> {

    private int capacity;

    public Solution146LRUCache( int capacity ) {
        super(capacity , 0.75F ,true);
        this.capacity = capacity;
    }

    public int get ( int key ) {
        return super.getOrDefault( key , -1);
    }

    public void put ( int key , int value ) {
        super.put( key , value );
    }

    @Override
    protected boolean removeEldestEntry ( Map.Entry<Integer , Integer> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {

    }
}
