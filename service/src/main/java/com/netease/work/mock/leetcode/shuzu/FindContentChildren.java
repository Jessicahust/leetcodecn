package com.netease.work.mock.leetcode.shuzu;

import java.util.Arrays;

/**
 * description:
 * Date: 2019-10-26 下午10:39<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FindContentChildren {
    public static void main(String[] args) {
        System.out.println(new FindContentChildren().findContentChildren(new int[]{},new int[]{}));
    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length - 1;
        int j = s.length - 1;
        int count = 0;
        while (i>=0 && j>=0){
            if (g[i]<=s[j]){
                ++count;
                --i;
                --j;
            }else {
                --i;
            }
        }
        return count;
    }
}
