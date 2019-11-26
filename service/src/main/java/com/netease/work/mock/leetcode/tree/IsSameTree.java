package com.netease.work.mock.leetcode.tree;

/**
 * description:
 * Date: 2019-09-28 下午3:56<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsSameTree {


    public static void main(String[] args) {
        System.out.println(new IsSameTree().isSameTree(new TreeNode(1), new TreeNode(1)));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null) {
            return false;
        }
        if (q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
