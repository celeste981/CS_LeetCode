/**
 * Copyright (C), 2016-2021, 华中科技大学
 * FileName: Solution971
 * Author:   CS
 * Date:     2021/2/5 13:15
 * Description: 翻转二叉树以匹配先序遍历：通过交换节点的左子节点和右子节点，可以翻转该二叉树中的节点。  考虑从根节点开始的先序遍历报告的 N 值序列。将这一 N 值序列称为树的行程。我们的目标是翻转最少的树中节点，以便树的行程与给定的行程 voyage 相匹配。   如果可以，则返回翻转的所有节点的值的列表。你可以按任何顺序返回答案。  如果不能，则返回列表 [-1]。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solutioin.DepthFirstSearch;


import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈翻转二叉树以匹配先序遍历：通过交换节点的左子节点和右子节点，可以翻转该二叉树中的节点。
 * 考虑从根节点开始的先序遍历报告的 N 值序列。
 * 将这一 N 值序列称为树的行程。
 * 我们的目标是翻转最少的树中节点，以便树的行程与给定的行程voyage相匹配。
 * 如果可以，则返回翻转的所有节点的值的列表。你可以按任何顺序返回答案。
 * 如果不能，则返回列表 [-1]。〉
 *
 *
 *  * Definition for a binary tree node.
 *  * public class TreeNode {
 *  *     int val;
 *  *     TreeNode left;
 *  *     TreeNode right;
 *  *     TreeNode(int x) { val = x; }
 *  * }
 *
 * @author CS
 * @create 2021/2/5
 * @since 1.0.0
 */
public class Solution971 {

    List<Integer> ans = new ArrayList<Integer>();
    int index = 0;
    int[] voyage;

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        this.voyage = voyage;
        dfs(root);
        if (!ans.isEmpty() && ans.get(0) == -1) {
            ans.clear();
            ans.add(-1);
        }
        return ans;
    }

    public void dfs(TreeNode root) {
        if (root != null) {
            if (root.val != voyage[index++]) {
                ans.clear();
                ans.add(-1);
                return;
            }
            if (index < voyage.length && root.left != null && root.left.val != voyage[index]){
                ans.add(root.val);
                dfs(root.right);
                dfs(root.left);
            }
            else{
                dfs(root.left);
                dfs(root.right);
            }
        }
    }

        public static void main (String[]args){
            Solution971 solution971 = new Solution971();
            //System.out.println(new TreeNode[]{new TreeNode(1), 2 ,3} , );
        }

}
