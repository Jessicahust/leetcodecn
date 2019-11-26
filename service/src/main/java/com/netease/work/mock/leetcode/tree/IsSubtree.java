package com.netease.work.mock.leetcode.tree;

/**
 * description: 572. 另一个树的子树
 * Date: 2019-10-05 下午7:56<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsSubtree {
    boolean result =false;
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null && t == null){
            return true;
        }
        preOrder(s,t);
        return result;
    }

    private boolean preOrder(TreeNode s, TreeNode t){
        if(s!=null){
            result = isSub(s,t);
            if(result){
                return true;
            }
            result = preOrder(s.left,t);
            if(result){
                return true;
            }
            result = preOrder(s.right,t);
            if(result){
                return true;
            }
        }
        return result;
    }

    private boolean isSub(TreeNode s,TreeNode t){
        if(s == null && t == null){
            return true;
        }
        if(s == null){
            return false;
        }
        if(t == null){
            return false;
        }
        if(s.val!=t.val){
            return false;
        }
        return isSub(s.left,t.left)&&isSub(s.right,t.right);
    }
}
