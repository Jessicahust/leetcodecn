package com.netease.work.mock.leetcode.shuzu;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * description:
 * Date: 2019-10-13 下午6:04<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class UniqueOccurrences {

    public static void main(String[] args) {
        System.out.println(new UniqueOccurrences().uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; ++i) {
            if (map.containsKey(arr[i])) {
                Integer integer = map.get(arr[i]);
                map.put(arr[i], integer + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        HashSet<Integer> integers = new HashSet<>(map.values());
        return integers.size()==map.values().size();
    }
}
