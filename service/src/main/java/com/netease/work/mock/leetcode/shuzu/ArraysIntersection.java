package com.netease.work.mock.leetcode.shuzu;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Date: 2019-10-07 下午5:46<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ArraysIntersection {

    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;
        List<Integer> res = new ArrayList<>();
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr1[i] == arr3[k]) {
                res.add(arr1[i]);
                ++i;
                ++j;
                ++k;
                continue;
            }
            int min = Math.min(Math.min(arr1[i], arr2[j]), arr3[k]);
            if (min == arr1[i]) {
                ++i;
            } else if (min == arr2[j]) {
                ++j;
            } else if (min == arr3[k]) {
                ++k;
            }
        }
        return res;
    }
}
