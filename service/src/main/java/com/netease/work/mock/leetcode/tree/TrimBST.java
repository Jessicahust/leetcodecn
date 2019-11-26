package com.netease.work.mock.leetcode.tree;

/**
 * description:
 * Date: 2019-10-04 下午8:25<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class TrimBST {

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        //下面两个if相当于删除不满足要求的节点
        if (root.val < L) {
            return trimBST(root.right, L, R);
        }
        if (root.val > R) {
            return trimBST(root.left, L, R);
        }
        //处理正常的节点
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}
