package com.netease.work.mock.leetcode.zifuchuan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description:
 * Date: 2019-11-02 下午9:44<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class BuddyStrings {

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        int count = 0;
        List<Integer> index = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length(); ++i) {
            if (map.get(A.charAt(i) + "") == null) {
                map.put(A.charAt(i) + "", 1);
            } else {
                map.put(A.charAt(i) + "", map.get(A.charAt(i) + "") + 1);
            }
            if (A.charAt(i) != B.charAt(i)) {
                index.add(i);
                ++count;
                if (count > 2) {
                    return false;
                }
            }
        }
        if (count == 2) {
            if (A.charAt(index.get(0))!=B.charAt(index.get(1))){
                return false;
            }
            if (A.charAt(index.get(1))!=B.charAt(index.get(0))){
                return false;
            }
            return true;
        }
        if (count == 1) {
            return false;
        }
        if (count == 0) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
