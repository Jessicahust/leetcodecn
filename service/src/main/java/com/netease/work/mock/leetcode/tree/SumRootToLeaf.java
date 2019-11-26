package com.netease.work.mock.leetcode.tree;

/**
 * description:
 * Date: 2019-10-05 下午4:28<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class SumRootToLeaf {


    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        if(root == null){
            return 0;
        }
        String path = "";
        helper(root,path);
        return sum;
    }
    private void helper(TreeNode root,String path){
        if(root == null){
            return;
        }
        path += root.val;
        if(root.left==null && root.right==null){
            sum +=Integer.parseInt(path,2);
            return;
        }
        helper(root.left,path);
        helper(root.right,path);
    }
}
