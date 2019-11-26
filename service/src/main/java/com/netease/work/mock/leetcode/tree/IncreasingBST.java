package com.netease.work.mock.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Date: 2019-10-04 下午9:31<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IncreasingBST {

    List<TreeNode> treeNodes = new ArrayList<>();

    public TreeNode increasingBST(TreeNode root) {
        inOrder(root);
        if (treeNodes.size() > 0) {
            root = treeNodes.get(0);
            TreeNode tmp = root;
            for (int i = 1; i < treeNodes.size(); ++i) {
                TreeNode treeNode = treeNodes.get(i);
                treeNode.left = treeNode.right = null;
                tmp.left = null;
                tmp.right = treeNode;
                tmp = tmp.right;
            }
        }
        return root;
    }

    private void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            treeNodes.add(root);
            inOrder(root.right);
        }
    }
}
