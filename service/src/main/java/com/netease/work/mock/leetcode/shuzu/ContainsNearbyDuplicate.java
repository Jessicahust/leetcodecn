package com.netease.work.mock.leetcode.shuzu;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 * Date: 2019-09-30 上午12:07<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        System.out.println(new ContainsNearbyDuplicate().containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            Integer integer = map.get(nums[i]);
            if (integer != null) {
                if (i - integer <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
