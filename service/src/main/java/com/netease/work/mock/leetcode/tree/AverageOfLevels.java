package com.netease.work.mock.leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * description:
 * Date: 2019-10-04 下午9:50<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class AverageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.add((double) root.val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Double sum = 0.0;
            Queue<TreeNode> lineQueue = new LinkedList<>();
            while (!queue.isEmpty()) {
                root = queue.poll();
                if (root.left != null) {
                    lineQueue.add(root.left);
                    sum += root.left.val;
                }
                if (root.right != null) {
                    lineQueue.add(root.right);
                    sum += root.right.val;
                }
            }
            queue = new LinkedList<>(lineQueue);
            lineQueue.clear();
            if (queue.size() > 0) {
                result.add(sum / queue.size());
            }
        }
        return result;
    }

}
