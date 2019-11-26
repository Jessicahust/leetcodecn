package com.netease.work.mock.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 257. 二叉树的所有路径
 * Date: 2019-10-02 下午1:39<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class BinaryTreePaths {

    List<String> res = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        String path = "";
        helper(root, path);
        return res;
    }

    private void helper(TreeNode root, String path) {
        if (root == null) {
            return;
        }
        path += root.val + "->";
        if (root.right == null && root.left == null) {
            String substring = path.substring(0, path.length() - 2);
            res.add(substring);
        }
        if (root.left != null) {
            helper(root.left, path);
        }
        if (root.right != null) {
            helper(root.right, path);
        }
    }
}
