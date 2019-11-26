package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-28 下午10:02<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FindLengthOfLCIS {

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxLen = 1;
        int curLen = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i - 1] < nums[i]) {
                ++curLen;
            } else {
                if (curLen > maxLen) {
                    maxLen = curLen;
                }
                curLen = 1;
            }
        }
        if (curLen > maxLen) {
            maxLen = curLen;
        }
        return maxLen;
    }
}
