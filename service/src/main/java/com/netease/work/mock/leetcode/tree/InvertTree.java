package com.netease.work.mock.leetcode.tree;

/**
 * description:
 * Date: 2019-09-21 下午11:20<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class InvertTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(3);
        TreeNode treeNode = new InvertTree().invertTree(root);
        System.out.println(treeNode.val+" "+treeNode.left.val+" "+treeNode.right.val );
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.right == null && root.left == null) {
            return root;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.right);
        invertTree(root.left);
        return root;
    }
}
