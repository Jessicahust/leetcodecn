package com.netease.work.mock.leetcode.tree;

/**
 * description:
 * Date: 2019-10-07 下午4:05<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ConstructMaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int index = 0;
        int maxValue = nums[0];
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > maxValue) {
                index = i;
                maxValue = nums[i];
            }
        }
        TreeNode root = new TreeNode(maxValue);
        root.left = constructMaxTree(nums, 0, index - 1);
        root.right = constructMaxTree(nums, index + 1, nums.length - 1);
        return root;
    }

    private TreeNode constructMaxTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int index = left;
        int maxValue = nums[left];
        for (int i = left; i <= right; ++i) {
            if (nums[i] > maxValue) {
                index = i;
                maxValue = nums[i];
            }
        }
        TreeNode treeNode = new TreeNode(maxValue);
        treeNode.left = constructMaxTree(nums, left, index - 1);
        treeNode.right = constructMaxTree(nums, index + 1, right);
        return treeNode;
    }
}
