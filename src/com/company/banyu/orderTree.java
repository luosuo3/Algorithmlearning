package com.company.banyu;


import javax.swing.tree.TreeNode;
import java.util.Stack;

/**
 * @author 王峥
 * @date 2021/1/3 3:56 下午
 */
public class orderTree {
    public static void tree (TreeNode node) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode treeNode = node;
        while (treeNode!=null || !stack.isEmpty()) {
            if (treeNode != null) {
                System.out.println(node.val);
                stack.push(treeNode);
                treeNode = treeNode.left;
            } else {
                TreeNode treeNode2 = stack.pop();
                treeNode = treeNode2.right;
            }
        }
    }
    public static void tree2(TreeNode node) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode treeNode = node;
        while (treeNode != null || !stack.isEmpty()) {
            if (treeNode != null) {
                System.out.println(node.val);
                stack.push(treeNode);
                treeNode = treeNode.left;
            } else {
                TreeNode pop = stack.pop();
                pop = pop.right;
            }
        }

    }
    public class TreeNode {
        int val;
       TreeNode left;
       TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
