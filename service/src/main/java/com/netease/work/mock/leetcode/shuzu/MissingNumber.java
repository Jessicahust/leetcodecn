package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-09-23 上午1:09<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(new MissingNumber().missingNumber(new int[]{1}));
    }

    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; ) {
            if (nums[i] != i && nums[i] < nums.length && nums[nums[i]] != nums[i]) {
                int tmp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = tmp;
            } else {
                ++i;
            }
        }
        for (int i = 0; i < nums.length; ++i) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
