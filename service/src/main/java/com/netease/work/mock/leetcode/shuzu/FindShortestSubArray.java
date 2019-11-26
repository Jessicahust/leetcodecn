package com.netease.work.mock.leetcode.shuzu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description:
 * Date: 2019-10-27 下午8:48<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FindShortestSubArray {
    public static void main(String[] args) {
        System.out.println(new FindShortestSubArray().findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
    }

    public int findShortestSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            List<Integer> list = map.get(nums[i]);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(i);
            map.put(nums[i], list);
        }
        int max = 0;
        int minLen = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> value = entry.getValue();
            Collections.sort(value);
            if (value.size() > max) {
                max = value.size();
                minLen = value.get(value.size() - 1) - value.get(0) + 1;
            } else if (value.size() == max) {
                int len = value.get(value.size() - 1) - value.get(0) + 1;
                if (len < minLen) {
                    minLen = len;
                }
            }
        }
        return minLen;
    }
}
