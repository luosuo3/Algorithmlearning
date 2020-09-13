package com;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(",");
        TreeNode treeNode = new TreeNode(Integer.valueOf(split[0]));
        Queue queue=new ArrayDeque<TreeNode>();
        queue.add(treeNode);
        for (int i = 1; i < split.length; i++) {
            treeNode.left = new TreeNode(Integer.valueOf(split[i]));
            queue.add(treeNode.left);
            i++;
            treeNode.right = new TreeNode(Integer.valueOf(split[i]));
            queue.add(treeNode.right);
        }
        do {
            TreeNode poll = (TreeNode) queue.poll();
            if (poll.left!=null&&poll.right!=null) {
                int temp=poll.val;
                poll.val = poll.right.val;
                poll.right = poll;
                poll.left = poll.right;

            }
        } while (queue!=null);


    }

}
