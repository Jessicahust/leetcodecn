package com.netease.work.mock.leetcode.tree;

/**
 * description: 437. 路径总和 III
 * Date: 2019-09-22 下午9:03<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class PathSum3 {
    public static void main(String[] args) {
        System.out.println(new PathSum3().pathSum(new TreeNode(1), 3));
    }

    int res = 0;

    public int pathSum(TreeNode root, int sum) {
        if (root == null){
            return 0;
        }
        dfs(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return res;
    }

    private void dfs(TreeNode root, int sum) {
        if (root == null) {
            return ;
        }
        if (sum == root.val){
            ++res;
        }
        dfs(root.left,sum-root.val);
        dfs(root.right,sum -root.val);
        return ;
    }
}
