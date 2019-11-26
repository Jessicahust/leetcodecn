package com.netease.work.mock.leetcode.tree;

/**
 * description:
 * Date: 2019-09-30 下午10:38<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class LowestCommonAncestor {

    private TreeNode res ;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null){
            return null;
        }
        if (isParent(root,p) && isParent(root,q)){
            res = root;
            lowestCommonAncestor(root.left,p,q);
            lowestCommonAncestor(root.right,p,q);
        }
        return res;
    }

    private boolean isParent(TreeNode root, TreeNode p) {
        if (root == null){
            return false;
        }
        if (root == p || root.left == p || root.right == p){
            return true;
        }
        return isParent(root.left,p) || isParent(root.right,p);
    }
}
