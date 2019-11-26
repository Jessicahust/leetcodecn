package com.netease.work.mock.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Date: 2019-10-04 下午11:02<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FindTarget {

    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            int sum = list.get(i) + list.get(j);
            if (sum == k) {
                return true;
            } else if (sum < k) {
                ++i;
            } else {
                --j;
            }
        }
        return false;
    }

    private void inOrder(TreeNode root, List<Integer> list) {
        if (root != null) {
            inOrder(root.left, list);
            list.add(root.val);
            inOrder(root.right, list);
        }
    }
}
