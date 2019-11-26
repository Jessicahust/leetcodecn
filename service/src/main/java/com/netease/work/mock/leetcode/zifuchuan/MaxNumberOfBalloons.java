package com.netease.work.mock.leetcode.zifuchuan;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 * Date: 2019-10-20 下午9:41<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MaxNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); ++i) {
            String s = text.charAt(i) + "";
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        int count = 0;
        //balloon
        while (true) {
            Integer b = map.get("b");
            if (b == null || b < 1) {
                break;
            } else {
                map.put("b", b - 1);
            }
            Integer a = map.get("a");
            if (a == null || a < 1) {
                break;
            } else {
                map.put("a", a - 1);
            }
            Integer l = map.get("l");
            if (l == null || l < 2) {
                break;
            } else {
                map.put("l", l - 2);
            }
            Integer o = map.get("o");
            if (o == null || o < 2) {
                break;
            } else {
                map.put("o", o - 2);
            }
            Integer n = map.get("n");
            if (n == null || n < 1) {
                break;
            } else {
                map.put("n", n - 1);
            }
            ++count;
        }
        return count;
    }
}
