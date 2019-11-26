package com.netease.work.mock.leetcode.shuzu;

import java.util.Arrays;

/**
 * description:
 * Date: 2019-09-25 下午9:43<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class Intersect {
    public static void main(String[] args) {
        new Intersect().intersect(new int[]{}, new int[]{});
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] ret = new int[Math.min(nums1.length, nums2.length)];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        int index = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                ret[index++] = nums1[i];
                ++i;
                ++j;
                continue;
            }
            if (nums1[i] < nums2[j]) {
                ++i;
            } else {
                ++j;
            }
        }
        int[] result = new int[index];
        for (int ii = 0 ;ii<index;++ii){
            result[ii] = ret[ii];
        }
        return result;
    }
}
