/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution987VerticalTraversal
 * Author:   CS
 * Date:     2021/3/22 15:13
 * Description: 二叉树的垂序遍历
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

import java.util.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树的垂序遍历〉
 *
 * @author CS
 * @create 2021/3/22
 * @since 1.0.0
 */
public class Solution987VerticalTraversal {

    public List<List<Integer>> verticalTraversal ( TreeNode root ) {
        if ( root == null ) {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        TreeMap< int[] , PriorityQueue<TreeNode> > tree = new TreeMap<>(Comparator.comparingInt( (int[] o ) -> o[1] ).thenComparing( o -> o[0] ) );
        preOrder( root , tree , new int[]{ 0 , 0 });
//        Map < TreeNode , Integer> nodes = new HashMap<>();
//        nodes.put( root , 0);
        int curY = tree.firstKey()[1];
        List<Integer> curCol = new ArrayList<>();
        for ( int[] coordinate : tree.keySet() ) {
            if ( coordinate[1] == curY) {
                PriorityQueue< TreeNode > queue = tree.get( coordinate );
                while ( !queue.isEmpty() ) {
                    curCol.add(queue.poll().val);
                }
            } else {
                ans.add(curCol);
                curCol = new ArrayList<>();
                PriorityQueue< TreeNode > queue = tree.get( coordinate );
                while ( !queue.isEmpty() ) {
                    curCol.add( queue.poll().val );
                }
                curY = coordinate[1];
            }
        }
        if ( !curCol.isEmpty() ) {
            ans.add( curCol );
        }
        return ans;
    }

    public void preOrder ( TreeNode root , TreeMap< int[] , PriorityQueue<TreeNode> > map , int[] coordinate ) {
        if ( root == null ) {
            return ;
        }
        PriorityQueue< TreeNode > list = map.getOrDefault( coordinate , new PriorityQueue<>( Comparator.comparingInt(o -> o.val)));
        list.add( root );
        map.put( coordinate , list );
        int x = coordinate[0];
        int y = coordinate[1];
        preOrder( root.left , map , new int[]{ x + 1 , y - 1 });
        preOrder( root.right , map , new int[]{ x + 1 , y + 1 });
    }

    public static void main(String[] args) {

    }

}
