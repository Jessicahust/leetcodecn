package com.netease.work.mock.leetcode.tree;


/**
 * description:
 * Date: 2019-09-16 下午10:49<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsSymmetric {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(new IsSymmetric().isSymmetric(root));
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        if (root.left == null && root.right == null){
            return true;
        }
        if (root.left!=null && root.right != null && root.left.val!=root.right.val){
            return false;
        }
        if (root.left == null || root.right==null){
            return false;
        }
        return isTreeSymmetric(root.left,root.right);
    }

    private boolean isTreeSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }
        if (left.val!=right.val){
            return false;
        }
        return isTreeSymmetric(left.left,right.right)&&isTreeSymmetric(left.right,right.left);
    }
}
