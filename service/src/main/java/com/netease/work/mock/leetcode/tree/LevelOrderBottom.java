package com.netease.work.mock.leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * description:
 * Date: 2019-09-28 下午4:01<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class LevelOrderBottom {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(20);
        System.out.println(new LevelOrderBottom().levelOrderBottom(treeNode));
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Integer> line = new ArrayList<>();
        line.add(root.val);
        result.add(line);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            line = new ArrayList<>();
            Queue<TreeNode> lineQueue = new LinkedList<>();
            while (!queue.isEmpty()) {
                root = queue.poll();
                if (root.left != null) {
                    lineQueue.add(root.left);
                    line.add(root.left.val);
                }
                if (root.right != null) {
                    lineQueue.add(root.right);
                    line.add(root.right.val);
                }
            }
            queue = new LinkedList<>(lineQueue);
            lineQueue.clear();
            if (line.size()>0) {
                result.add(line);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
