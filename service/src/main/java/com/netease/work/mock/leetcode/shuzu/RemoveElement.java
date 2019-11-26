package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-09-26 下午8:58<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class RemoveElement {

    public static void main(String[] args) {
        System.out.println(new RemoveElement().removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == val) {
                ++count;
                continue;
            }
            nums[i - count] = nums[i];
        }
        return nums.length - count;
    }
}
