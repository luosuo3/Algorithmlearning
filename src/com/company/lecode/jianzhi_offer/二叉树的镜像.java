package com.company.lecode.jianzhi_offer;//请完成一个函数，输入一个二叉树，该函数输出它的镜像。
//
// 例如输入： 
//
// 4 
// / \ 
// 2 7 
// / \ / \ 
//1 3 6 9 
//镜像输出： 
//
// 4 
// / \ 
// 7 2 
// / \ / \ 
//9 6 3 1 
//
// 
//
// 示例 1： 
//
// 输入：root = [4,2,7,1,3,6,9]
//输出：[4,7,2,9,6,3,1]
// 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 1000 
//
// 注意：本题与主站 226 题相同：https://leetcode-cn.com/problems/invert-binary-tree/ 
// Related Topics 树 
// 👍 53 👎 0


//leetcode submit region begin(Prohibit modification and deletion)


import java.util.Stack;

//Definition for a binary tree node.

/*class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root==null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
    }
}*/
class 二叉树的镜像 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root==null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>(){{add(root);}};
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left!=null) {
                stack.add(node.left);
            }
            if (node.right!=null) {
                stack.add(node.right);
            }
            TreeNode tmp = node.right;
            node.left = node.right;
            node.right = tmp;
        }
        return root;

    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
