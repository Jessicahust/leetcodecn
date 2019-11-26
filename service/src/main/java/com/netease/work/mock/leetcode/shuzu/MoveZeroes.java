package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-09-22 上午12:05<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] ints = {0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(ints);
        for (int i = 0; i < ints.length; ++i) {
            System.out.println(ints[i]);
        }
    }

    public void moveZeroes(int[] nums) {
        int numZeros = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
                ++numZeros;
                continue;
            }
            nums[i - numZeros] = nums[i];
        }
        for (int i = nums.length - 1; numZeros > 0; --i) {
            nums[i] = 0;
            --numZeros;
        }
    }

}
