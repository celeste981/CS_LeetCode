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
import java.util.HashMap;
import java.util.HashSet;
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

    List<TreeNode>  ans = new ArrayList<>();
    HashMap<String , Integer> map = new HashMap<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return ans;
    }

    public String traverse(TreeNode root) {
        if (root == null){
            return "#";
        }
        String rootStr = traverse(root.left) + "," + traverse(root.right) + "," + root.val;
        int fre = map.getOrDefault(rootStr , 0);
        if (fre == 1) {
            ans.add(root);
            System.out.println(rootStr);
        }
        map.put(rootStr , fre + 1);
        return rootStr;
    }


    public static void main(String[] args) {
        Solution652 solution652 = new Solution652();
        TreeNode root = new TreeNode(10);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(22);
        root.left = l; root.right = r;
        TreeNode ll = new TreeNode(1);
        TreeNode lr = new TreeNode(12);
        l.left = ll; l.right = lr;
        TreeNode rl = new TreeNode(1);
        TreeNode rr = new TreeNode(1);
        r.left = rl; r.right = rr;
        solution652.findDuplicateSubtrees(root);
    }
}
