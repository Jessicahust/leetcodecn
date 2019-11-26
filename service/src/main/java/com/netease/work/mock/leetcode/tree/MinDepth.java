package com.netease.work.mock.leetcode.tree;

/**
 * description:
 * Date: 2019-09-28 下午4:47<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MinDepth {
    public static void main(String[] args) {
        System.out.println(new MinDepth().minDepth(new TreeNode(1)));
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return Math.min(left, right) + 1;
    }

    
}
