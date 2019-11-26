package com.netease.work.mock.leetcode;

/**
 * description:108. 将有序数组转换为二叉搜索树
 * Date: 2019-09-16 下午11:42<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class SortedArrayToBST {

    public static void main(String[] args) {
        TreeNode treeNode = new SortedArrayToBST().sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        System.out.println(treeNode.val + " " + treeNode.left.val + " " + treeNode.right.val);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedTreeToBST(nums, left, mid - 1);
        root.right = sortedTreeToBST(nums, mid + 1, right);
        return root;
    }

    private TreeNode sortedTreeToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        if (left == right) {
            return new TreeNode(nums[left]);
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedTreeToBST(nums, left, mid - 1);
        root.right = sortedTreeToBST(nums, mid + 1, right);
        return root;
    }
}
