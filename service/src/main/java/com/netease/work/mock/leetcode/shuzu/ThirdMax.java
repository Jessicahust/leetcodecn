package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-20 下午6:18<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ThirdMax {

    public static void main(String[] args) {
        System.out.println(new ThirdMax().thirdMax(new int[]{2,1,-2147483648}));
    }
    public int thirdMax(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        boolean isMin = false;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == Integer.MIN_VALUE) {
                isMin = true;
            }
            if (nums[i] >= max1) {
                if (nums[i] != max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = nums[i];
                }
            } else if (nums[i] >= max2) {
                if (nums[i] > max2) {
                    max3 = max2;
                    max2 = nums[i];
                }
            } else if (nums[i] >= max3) {
                max3 = nums[i];
            }
        }
        if (isMin) {
            if (max2 == Integer.MIN_VALUE) {
                return max1;
            } else {
                return Integer.MIN_VALUE;
            }
        }
        return max3 == Integer.MIN_VALUE ? max1 : max3;
    }
}
