package com.netease.work.mock.leetcode.zifuchuan;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 * Date: 2019-09-29 下午11:19<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsIsomorphic {
    public static void main(String[] args) {
        System.out.println(new IsIsomorphic().isIsomorphic("aba", "aab"));
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            String s1 = s.charAt(i) + "";
            String s2 = t.charAt(i) + "";
            if (!map1.containsKey(s1) && !map2.containsKey(s2)) {
                map1.put(s1, s2);
                map2.put(s2, s1);
            } else if (!map1.containsKey(s1)) {
                return false;
            } else if (!map2.containsKey(s2)) {
                return false;
            } else {
                if (!map1.get(s1).equals(s2) || !map2.get(s2).equals(s1)) {
                    return false;
                }
            }
        }
        return true;
    }
}
