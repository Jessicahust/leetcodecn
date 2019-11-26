package com.netease.work.mock.leetcode.zifuchuan;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 * Date: 2019-09-24 下午11:48<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(new IsAnagram().isAnagram("rat", "rar"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<String, Integer> mapS = new HashMap<>();
        Map<String, Integer> mapT = new HashMap<>();
        int i = 0;
        while (i < s.length()) {
            if (mapS.containsKey(s.charAt(i) + "")) {
                Integer num = mapS.get(s.charAt(i) + "");
                mapS.put(s.charAt(i) + "", num + 1);
            } else {
                mapS.put(s.charAt(i) + "", 1);
            }
            if (mapT.containsKey(t.charAt(i) + "")) {
                Integer num = mapT.get(t.charAt(i) + "");
                mapT.put(t.charAt(i) + "", num + 1);
            } else {
                mapT.put(t.charAt(i) + "", 1);
            }
            ++i;
        }
        for (Map.Entry<String,Integer> entry : mapS.entrySet()){
            String key = entry.getKey();
            if (!entry.getValue().equals(mapT.get(key))){
                return false;
            }
        }
        return true;
    }
}
