package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-10-29 下午11:53<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ConstructRectangle {

    public int[] constructRectangle(int area) {

        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            --w;
        }
        return new int[]{area/w,w};
    }
}
