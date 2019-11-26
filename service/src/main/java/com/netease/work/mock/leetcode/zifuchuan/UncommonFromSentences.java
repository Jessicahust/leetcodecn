package com.netease.work.mock.leetcode.zifuchuan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description:
 * Date: 2019-10-27 下午8:06<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class UncommonFromSentences {
    public static void main(String[] args) {
        System.out.println(new UncommonFromSentences().uncommonFromSentences("this apple is sweet", "this apple is sour"));
    }

    public String[] uncommonFromSentences(String A, String B) {

        String[] s1 = A.split(" ");
        String[] s2 = B.split(" ");
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length; ++i) {
            if (map.containsKey(s1[i])) {
                map.put(s1[i], map.get(s1[i]) + 1);
            } else {
                map.put(s1[i], 1);
            }
        }
        for (int i = 0; i < s2.length; ++i) {
            if (map.containsKey(s2[i])) {
                map.put(s2[i], map.get(s2[i]) + 1);
            } else {
                map.put(s2[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1){
                res.add(entry.getKey());
            }
        }
        String[] ret = new String[res.size()];
        return res.toArray(ret);
    }
}
