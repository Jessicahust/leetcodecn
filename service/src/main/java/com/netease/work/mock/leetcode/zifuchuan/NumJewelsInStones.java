package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-02 下午9:39<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class NumJewelsInStones {
    public static void main(String[] args) {
        System.out.println(new NumJewelsInStones().numJewelsInStones("aA", "aAAbbbb"));
    }

    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); ++i) {
            int i1 = J.indexOf(S.charAt(i));
            if (i1 != -1) {
                ++count;
            }
        }
        return count;
    }
}
