package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-22 下午5:12<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class HammingDistance {

    public static void main(String[] args) {
        System.out.println(new HammingDistance().hammingDistance(1, 4));
    }

    public int hammingDistance(int x, int y) {
        int xory = x ^ y;
        int sum = 0;
        while (xory != 0) {
            xory = xory & (xory - 1);
            sum++;
        }
        return sum;
    }
}
