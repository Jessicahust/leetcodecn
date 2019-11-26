package com.netease.work.mock.leetcode.zifuchuan;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Date: 2019-10-13 下午7:48<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ShortestToChar {

    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) == C) {
                ret.add(i);
            }
        }
        for (int i = 0; i < S.length(); ++i) {
            int min = S.length();
            for (Integer index : ret) {
                min = Math.min(min, Math.abs(i - index));
            }
            result[i] = min;
        }
        return result;
    }
}
