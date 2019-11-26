package com.netease.work.mock.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Date: 2019-10-04 下午9:58<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class LeafSimilar {


    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        preOrder(root1, list1);
        List<Integer> list2 = new ArrayList<>();
        preOrder(root2, list2);
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); ++i) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private void preOrder(TreeNode root, List<Integer> list) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                list.add(root.val);
            }
            preOrder(root.left, list);
            preOrder(root.right, list);
        }
    }
}
