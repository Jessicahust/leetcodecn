package com.netease.work.mock.leetcode.shuzu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * description:
 * Date: 2019-10-02 下午5:44<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                ++i;
            } else if (nums1[i] > nums2[j]) {
                ++j;
            } else {
                result.add(nums1[i]);
                ++i;
                ++j;
            }
        }
        int[] arr = new int[result.size()];
        Object[] objects = result.toArray();
        for (int index = 0; index < objects.length; ++index) {
            arr[index] = (int) objects[index];
        }
        return arr;
    }
}
