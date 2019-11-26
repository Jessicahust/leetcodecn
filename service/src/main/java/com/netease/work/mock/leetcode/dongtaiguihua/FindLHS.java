package com.netease.work.mock.leetcode.dongtaiguihua;

/**
 * description:
 * Date: 2019-11-19 下午11:14<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FindLHS {

    public int findLHS(int[] nums) {
        int minI = 0;
        int maxI = 0;
        int minV = Integer.MAX_VALUE;
        int maxV = Integer.MIN_VALUE;
        int maxLen = 0;
        for (int i = 0; i < nums.length; ) {
            if (nums[i] > maxV) {
                if (nums[i] - minI > 1) {
                    if (maxI - minI + 1 > maxLen) {
                        maxLen = maxI - minI + 1;
                    }
                    maxV = nums[i];
                    maxI = i;
                    i = minI + 1;
                    minV = nums[i];
                } else {
                    maxV = nums[i];
                    maxI = i;
                }

            }
            if (nums[i] < minV) {
                if (maxV - nums[i] > 1) {
                    if (maxI - minI + 1 > maxLen) {
                        maxLen = maxI - minI + 1;
                    }
                    maxV = nums[i];
                    maxI = i;
                    i = minI + 1;
                    minV = nums[i];
                } else {
                    maxI = i;
                    minV = nums[i];
                }
            }
        }
        return 0;
    }
}
