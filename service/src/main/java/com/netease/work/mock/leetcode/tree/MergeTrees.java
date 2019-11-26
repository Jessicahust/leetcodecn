package com.netease.work.mock.leetcode.tree;

/**
 * description:
 * Date: 2019-09-22 下午8:49<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MergeTrees {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(3);
        treeNode1.right = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(2);
        treeNode2.left = new TreeNode(1);
        TreeNode treeNode = new MergeTrees().mergeTrees(treeNode1, treeNode2);
        System.out.println(treeNode.val);
        System.out.println(treeNode.left.val);
        System.out.println(treeNode.right.val);
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null){
            return t2;
        }
        if (t2 == null){
            return t1;
        }
        t1.val = t1.val + t2.val;
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);
        return t1;
    }
}
