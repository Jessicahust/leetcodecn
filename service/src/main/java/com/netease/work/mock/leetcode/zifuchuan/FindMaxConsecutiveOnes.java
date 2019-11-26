package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-19 下午7:58<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FindMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int curCount = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                ++curCount;
            } else {
                if (curCount > maxCount) {
                    maxCount = curCount;
                }
                curCount = 0;
            }
        }
        return Math.max(curCount, maxCount);
    }
}
