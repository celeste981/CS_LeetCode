/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution652
 * Author:   CS
 * Date:     2021/3/9 9:45
 * Description: 寻找重复的子树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈寻找重复的子树〉
 *
 * @author CS
 * @create 2021/3/9
 * @since 1.0.0
 */
public class Solution652 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {};
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val , TreeNode left , TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode>  ans = new ArrayList<>();

        return ans;
    }

    public static void main(String[] args) {
        Solution652 solution652 = new Solution652();
    }
}
