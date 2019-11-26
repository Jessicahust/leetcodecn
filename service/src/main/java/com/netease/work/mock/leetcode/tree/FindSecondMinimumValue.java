package com.netease.work.mock.leetcode.tree;

/**
 * description: 671. 二叉树中第二小的节点
 * Date: 2019-10-05 下午5:36<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FindSecondMinimumValue {

    public int findSecondMinimumValue(TreeNode root) {
        if(root == null){
            return -1;
        }
        return findSecondValue(root,root.val);
    }

    private int findSecondValue(TreeNode root,int val){
        if(root == null){
            return -1;
        }
        if(root.val>val){
            return root.val;
        }
        int leftVal = findSecondValue(root.left,val);
        int rightVal = findSecondValue(root.right,val);
        if(leftVal > val && rightVal > val){
            return Math.min(leftVal,rightVal);
        }
        return Math.max(leftVal,rightVal);
    }
}
