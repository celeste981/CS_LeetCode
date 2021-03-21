/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Node
 * Author:   CS
 * Date:     2021/3/21 16:14
 * Description: 无向图节点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.Stack_Queue;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈无向图节点〉
 *
 * @author CS
 * @create 2021/3/21
 * @since 1.0.0
 */
// Definition for a Node.
public class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}