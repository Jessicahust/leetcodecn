package com.netease.work.mock.leetcode;

import java.util.HashMap;

/**
 * description:
 * Date: 2019-11-18 下午11:05<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class NumberOfBoomerangs {

    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        HashMap<Double, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < points.length; ++i) {
            for (int j = 0; j < points.length; ++j) {
                if (i != j) {
                    double distince = Math.pow(points[i][0] - points[j][0], 2)
                            + Math.pow(points[i][1] - points[j][1], 2);
                    if (hashMap.containsKey(distince)) {
                        Integer tt = hashMap.get(distince);
                        count += 2 * tt;
                        hashMap.put(distince, tt + 1);
                    } else {
                        hashMap.put(distince, 1);
                    }
                }
            }
            hashMap.clear();
        }
        return count;
    }
}
