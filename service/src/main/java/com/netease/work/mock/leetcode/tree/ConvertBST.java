package com.netease.work.mock.leetcode.tree;

/**
 * description:
 * Date: 2019-09-22 下午5:25<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ConvertBST {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);

        TreeNode treeNode = new ConvertBST().convertBST(root);
        System.out.println(treeNode.val);
    }
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null){
            return null;
        }
        convertBST(root.right);
        root.val = root.val + sum;
        sum = root.val;
        convertBST(root.left);
        return root;
    }

}
