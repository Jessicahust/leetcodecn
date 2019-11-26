package com.netease.work.mock.leetcode.shuzu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description:
 * Date: 2019-10-28 下午10:51<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FindRestaurant {

    public static void main(String[] args) {
        new FindRestaurant().findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"});
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < list1.length; ++i) {
            List<Integer> index = new ArrayList<>();
            index.add(i);
            map.put(list1[i], index);
        }
        for (int i = 0; i < list2.length; ++i) {
            List<Integer> list = map.get(list2[i]);
            if (list != null) {
                list.add(i);
                map.put(list2[i], list);
            }
        }
        int minLen = 1000;
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            List<Integer> value = entry.getValue();
            if (value.size() == 2) {
                int abs = value.get(1)+value.get(0);
                if (abs < minLen) {
                    minLen = abs;
                }
            }
        }
        List<String> ret = new ArrayList<>();
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            List<Integer> value = entry.getValue();
            if (value.size() == 2) {
                int abs = value.get(1)+value.get(0);
                if (abs == minLen) {
                    ret.add(entry.getKey());
                }
            }
        }
        String[] strings = new String[ret.size()];
        return ret.toArray(strings);
    }
}
