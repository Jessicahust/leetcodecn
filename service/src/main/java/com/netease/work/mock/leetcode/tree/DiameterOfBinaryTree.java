package com.netease.work.mock.leetcode.tree;

/**
 * description:
 * Date: 2019-09-23 上午12:57<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class DiameterOfBinaryTree {

    public static void main(String[] args) {
        new DiameterOfBinaryTree().diameterOfBinaryTree(new TreeNode(1));
    }

    int maxHigh = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null){
            return 0;
        }
        maxHigh(root);
        return maxHigh;
    }

    private int maxHigh(TreeNode root) {
        if (root == null){
            return 0;
        }
        int maxLeft = maxHigh(root.left);
        int maxRight = maxHigh(root.right);
        if (maxLeft + maxRight > maxHigh){
            maxHigh = maxLeft + maxRight;
        }
        return Math.max(maxLeft,maxRight)+1;
    }
}
