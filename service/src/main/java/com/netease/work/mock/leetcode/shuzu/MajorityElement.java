package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-09-20 下午11:20<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement(new int[]{1,2,1}));
    }

    public int majorityElement(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int count = 1;
        int ret = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (count == 0) {
                ++count;
                ret = nums[i];
                continue;
            }
            if (ret == nums[i]) {
                ++count;
            } else {
                --count;
            }
        }
        return ret;
    }
}
