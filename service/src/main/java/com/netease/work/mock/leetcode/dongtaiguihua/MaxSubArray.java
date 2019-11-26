package com.netease.work.mock.leetcode.dongtaiguihua;

/**
 * description:
 * Date: 2019-09-16 上午12:11<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MaxSubArray {

    public static void main(String[] args) {
        System.out.println(new MaxSubArray().maxSubArray(new int[]{1,-2, 1}));
    }

    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int maxSum = nums[0];
        int currSum = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (currSum < 0) {
                currSum = nums[i];
            } else {
                currSum += nums[i];
            }
            if (maxSum < currSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}
