package com.netease.work.mock.leetcode.tree;

/**
 * description:
 * Date: 2019-10-02 下午10:32<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class RangeSumBST {
    public static void main(String[] args) {
        System.out.println(new RangeSumBST().rangeSumBST(new TreeNode(1), 1, 1));
    }

    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        inorder(root,L,R);
        return sum;
    }

    private void inorder(TreeNode root, int L, int R) {
        if (root != null) {
            if (root.val>R){
                return;
            }
            inorder(root.left, L, R);
            if (root.val >= L && root.val <= R) {
                sum += root.val;
            }
            inorder(root.right, L, R);
        }
    }
}
