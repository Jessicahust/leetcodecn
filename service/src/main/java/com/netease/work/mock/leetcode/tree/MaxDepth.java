package com.netease.work.mock.leetcode.tree;

/**
 * description: 104. 二叉树的最大深度
 * Date: 2019-09-16 下午11:04<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MaxDepth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(6);
        System.out.println(new MaxDepth().maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return (leftDepth >= rightDepth ? leftDepth : rightDepth) + 1;
    }
}
