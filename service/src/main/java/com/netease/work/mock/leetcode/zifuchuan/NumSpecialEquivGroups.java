package com.netease.work.mock.leetcode.zifuchuan;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * description:
 * Date: 2019-11-17 下午2:49<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class NumSpecialEquivGroups {

    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (int i = 0;i<A.length;++i){
            int[] qishu = new int[26];
            int[] oushu = new int[26];
            for (int j = 0;j<A[i].length();++j){
                if (j%2 == 0){
                    oushu[A[i].charAt(j)-'a']++;
                }else {
                    qishu[A[i].charAt(j)-'a']++;
                }
            }
            set.add(Arrays.toString(qishu)+Arrays.toString(oushu));
        }

        return set.size();
    }
}
