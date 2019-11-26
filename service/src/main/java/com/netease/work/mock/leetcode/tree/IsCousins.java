package com.netease.work.mock.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * description:
 * Date: 2019-10-05 下午4:07<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsCousins {


    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> lineQueue = new LinkedList<>();
            boolean first = false;
            int parent = 0;
            while (!queue.isEmpty()) {
                root = queue.poll();
                if (root.left != null) {
                    lineQueue.add(root.left);
                    if (root.left.val == x || root.left.val == y) {
                        if (first) {
                            if (root.val == parent){
                                return false;
                            }else {
                                return true;
                            }
                        } else {
                            first = true;
                            parent = root.val;
                        }
                    }
                }
                if (root.right != null) {
                    lineQueue.add(root.right);
                    if (root.right.val == x || root.right.val == y) {
                        if (first) {
                            if (root.val == parent){
                                return false;
                            }else {
                                return true;
                            }
                        } else {
                            first = true;
                            parent = root.val;
                        }
                    }
                }
            }
            queue = new LinkedList<>(lineQueue);
            lineQueue.clear();
            first = false;
        }
        return false;
    }
}
