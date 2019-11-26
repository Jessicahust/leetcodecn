package com.netease.work.mock.leetcode.zifuchuan;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 * Date: 2019-10-26 下午8:04<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(new LongestPalindrome().longestPalindrome("abccccdd"));
    }

    public int longestPalindrome(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            String key = s.charAt(i) + "";
            if (map.get(key) == null) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value % 2 == 0) {
                count += value;
            } else {
                count += value - 1;
            }
        }
        return count < s.length() ? count + 1 : count;
    }
}
