package com.netease.work.mock.leetcode.shuzu;


/**
 * description:
 * Date: 2019-11-18 下午11:35<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MinMoves {

    public int minMoves(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        int minValue = nums[0];
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            if (nums[i] <= minValue) {
                minValue = nums[i];
            }
        }
        return sum - nums.length * minValue;
    }
}
