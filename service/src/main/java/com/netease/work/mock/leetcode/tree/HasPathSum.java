package com.netease.work.mock.leetcode.tree;

/**
 * description:
 * Date: 2019-09-28 下午10:28<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class HasPathSum {

    public static void main(String[] args) {
        System.out.println(new HasPathSum().hasPathSum(new TreeNode(1), 22));
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        return pathSum(root, sum);
    }

    private boolean pathSum(TreeNode root, int value) {
        if (root == null) {
            return false;
        }
        value = value - root.val;
        if (value == 0 && root.left == null && root.right == null) {
            return true;
        }
        return pathSum(root.left, value) || pathSum(root.right, value);
    }
}
