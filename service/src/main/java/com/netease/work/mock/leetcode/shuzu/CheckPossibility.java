package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-20 下午9:00<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class CheckPossibility {

    public static void main(String[] args) {
        System.out.println(new CheckPossibility().checkPossibility(new int[]{2, 3, 3, 2, 4}));
    }

    public boolean checkPossibility(int[] nums) {
        boolean isSequence = true;

        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] <= nums[i + 1]) {
                continue;
            } else {
                if (!isSequence) {
                    return false;
                }
                isSequence = false;
                if (i < nums.length - 2 && nums[i] <= nums[i + 2]) {
                    continue;
                }
                if (i > 0 && nums[i - 1] <= nums[i + 1]) {
                    continue;
                }
                if (i > 0 && i < nums.length - 2){
                    return false;
                }
            }
        }
        return true;
    }
}
