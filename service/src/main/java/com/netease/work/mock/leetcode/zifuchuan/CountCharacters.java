package com.netease.work.mock.leetcode.zifuchuan;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 * Date: 2019-10-20 下午5:34<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class CountCharacters {

    public int countCharacters(String[] words, String chars) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length(); ++i) {
            String str = chars.charAt(i) + "";
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        int count = 0;
        for (int i = 0; i < words.length; ++i) {
            String str = words[i];
            boolean isContain = true;
            Map<String, Integer> countMap = new HashMap<>(map);
            for (int j = 0; j < str.length(); ++j) {
                String tmp = str.charAt(j) + "";
                Integer integer = countMap.get(tmp);
                if (integer == null || integer == 0) {
                    isContain = false;
                    break;
                } else {
                    countMap.put(tmp, integer - 1);
                }
            }
            if (isContain) {
                count += str.length();
            }
        }
        return count;
    }
}
