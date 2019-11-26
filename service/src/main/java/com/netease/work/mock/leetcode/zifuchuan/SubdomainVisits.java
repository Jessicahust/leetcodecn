package com.netease.work.mock.leetcode.zifuchuan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description:
 * Date: 2019-10-13 下午8:34<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class SubdomainVisits {

    public static void main(String[] args) {
        System.out.println(new SubdomainVisits().subdomainVisits(new String[]{"9001 discuss.leetcode.com"}));
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cpdomains.length; ++i) {
            String cpdomain = cpdomains[i];
            String[] sp = cpdomain.split(" ");
            map.put(sp[1], Integer.valueOf(sp[0]));
        }
        Map<String, Integer> integerMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            String[] split = key.split("\\.");
            String str = "";
            int i = split.length - 1;
            while (i >= 0) {
                if (str.equals("")) {
                    str = split[i];
                } else {
                    str = split[i] + "." + str;
                }
                integerMap.putIfAbsent(str, 0);
                integerMap.put(str, integerMap.get(str) + value);
                --i;
            }
        }
        for (Map.Entry<String, Integer> entry : integerMap.entrySet()) {
            String str = entry.getValue() + " " + entry.getKey();
            result.add(str);
        }
        return result;
    }
}
