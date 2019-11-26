package com.netease.work.mock.leetcode.tree;

/**
 * description:
 * Date: 2019-09-28 下午4:37<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsBalanced {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(new IsBalanced().isBalanced(root));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        if (Math.abs(left - right) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
