package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-20 下午11:28<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class TrailingZeroes {
    public static void main(String[] args) {
        System.out.println(new TrailingZeroes().trailingZeroes(25));
    }

    public int trailingZeroes(int n) {
        int sum = 0;
        while (n != 0) {
            n = n / 5;
            sum = sum + n;
        }
        return sum;
    }
}
