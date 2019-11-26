package com.netease.work.mock.leetcode.shuzu;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Date: 2019-10-12 下午11:06<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; ++i) {
            int num = nums1[i];
            int index = -1;
            int p = -1;
            for (int j = 0; j < nums2.length; ++j) {
                if (index == -1) {
                    if (nums2[j] == num) {
                        index = j;
                    }
                } else {
                    if (nums2[j] > num) {
                        p = nums2[j];
                        break;
                    }
                }
            }
            result.add(p);
        }
        int[] res = new int[result.size()];
        for (int i = 0 ; i<result.size();++i){
            res[i] = result.get(i);
        }
        return res;
    }
}
