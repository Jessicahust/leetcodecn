package com.netease.work.mock.leetcode.shuzu;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 * Date: 2019-11-02 下午5:54<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class NumEquivDominoPairs {
    public static void main(String[] args) {
        System.out.println(new NumEquivDominoPairs().numEquivDominoPairs1(new int[][]{{1,2},{1,2},{1,1},{1,2},{2,2}}));
    }

    public int numEquivDominoPairs(int[][] dominoes) {
        int length = dominoes.length;
        if (length < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < length; ++i) {
            for (int j = i + 1; j < length; ++j) {
                if (dominoes[i][0] == dominoes[j][0] && dominoes[i][1] == dominoes[j][1] || dominoes[i][1] == dominoes[j][0] && dominoes[i][0] == dominoes[j][1]) {
                    ++count;
                }
            }
        }
        return count;
    }

    public int numEquivDominoPairs1(int[][] dominoes) {
        int length = dominoes.length;
        if (length < 2) {
            return 0;
        }
        int count = 0;
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < length; ++i) {
            String key = dominoes[i][0] >= dominoes[i][1]?dominoes[i][0]+""+dominoes[i][1]:dominoes[i][1]+""+dominoes[i][0];
            Integer integer = map.get(key);
            if (integer != null){
                count += integer;
                map.put(key,integer+1);
            }else {
                map.put(key,1);
            }
        }
        return count;
    }
}
