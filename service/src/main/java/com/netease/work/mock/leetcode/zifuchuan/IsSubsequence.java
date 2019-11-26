package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-02 下午8:49<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(new IsSubsequence().isSubsequence("abc","abgdc"));
    }
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for (int i = 0;i<s.length();++i){
            int indexOf = t.indexOf(s.charAt(i), index);
            if (indexOf == -1){
                return false;
            }
            index = indexOf + 1;
        }
        return true;
    }
}
