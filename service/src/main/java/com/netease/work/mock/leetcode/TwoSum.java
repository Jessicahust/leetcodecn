package com.netease.work.mock.leetcode;

import java.util.HashMap;

/**
 * description:
 * Date: 2019-08-15 下午9:39<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[10];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;
        int[] ints = new TwoSum().twoSum(nums, 9);
        System.out.println(ints.length == 2 ? ints[0] + " " + ints[1] : "");
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        if (nums.length == 0) {
            return ret;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            hashMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; ++i) {
            int value = target - nums[i];
            Integer index = hashMap.get(value);
            if (index != null && index != i) {
                ret[0] = i;
                ret[1] = index;
                return ret;
            }
        }
        return ret;
    }
}
