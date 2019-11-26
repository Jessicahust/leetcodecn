package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-13 下午5:24<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class DiStringMatch {

    public int[] diStringMatch(String S) {
        int[] res = new int[S.length() + 1];
        int count = 0;
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) == 'I') {
                res[i] = count++;
            }
        }
        res[S.length()] = count++;
        for (int i = S.length() - 1; i >= 0; --i) {
            if (S.charAt(i) == 'D'){
                res[i] = count++;
            }
        }
        return res;
    }
}
