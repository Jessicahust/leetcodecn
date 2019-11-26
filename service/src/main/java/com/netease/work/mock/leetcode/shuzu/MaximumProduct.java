package com.netease.work.mock.leetcode.shuzu;

import java.util.Arrays;

/**
 * description:
 * Date: 2019-10-21 下午11:27<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MaximumProduct {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1]);
    }
}
