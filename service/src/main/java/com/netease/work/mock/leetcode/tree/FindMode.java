package com.netease.work.mock.leetcode.tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * description:
 * Date: 2019-10-05 下午5:56<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FindMode {


    int preVal = 0;
    Set<Integer> result = new HashSet();
    int maxTimes = 0;
    int preTimes = 0;

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(2);
        new FindMode().findMode(treeNode);
    }

    public int[] findMode(TreeNode root) {
        inorder(root);
        Iterator<Integer> iterator = result.iterator();
        int[] ints = new int[result.size()];
        int index = 0;
        while (iterator.hasNext()) {
            ints[index++] = iterator.next();
        }
        return ints;
    }

    private void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            if (root.val == preVal) {
                preTimes++;
            } else {
                preTimes = 1;
            }
            if (preTimes > maxTimes) {
                maxTimes = preTimes;
                result.clear();
                result.add(root.val);
            } else if (preTimes == maxTimes) {
                result.add(root.val);
            }
            preVal = root.val;
            inorder(root.right);
        }
    }
}
