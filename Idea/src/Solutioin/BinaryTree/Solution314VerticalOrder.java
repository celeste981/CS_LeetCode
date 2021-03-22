/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution314VerticalOrder
 * Author:   Administrator
 * Date:     2021/3/22 14:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

import java.util.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的层序遍历〉
 *
 * @author Administrator
 * @create 2021/3/22
 * @since 1.0.0
 */
public class Solution314VerticalOrder {

    public List<List<Integer>> verticalOrder ( TreeNode root ) {
        if ( root == null ) {
            return new ArrayList<>();
        }
        TreeMap< Integer , List<Integer> > ans = new TreeMap<>();
        Map< TreeNode , Integer > nodes = new HashMap<>();
        nodes.put( root , 0 );
        Deque< TreeNode > queue = new LinkedList<>();
        queue.offer(root);

        //层序遍历
        while ( !queue.isEmpty() ) {
            TreeNode cur = queue.poll();
            int curIndex = nodes.get( cur );
            ans.computeIfAbsent( curIndex , o -> new ArrayList<>()).add(cur.val);
            if ( cur.left != null ) {
                nodes.put( cur.left , curIndex - 1 );
                queue.offer( cur.left );
            }
            if ( cur.right != null ) {
                nodes.put( cur.right , curIndex + 1 );
                queue.offer( cur.right );
            }
        }

        return new ArrayList<>(ans.values());
    }

    public static void main(String[] args) {

    }
}
