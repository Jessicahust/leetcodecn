package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-30 下午9:14<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(new IsPowerOfTwo().isPowerOfTwo(4));
    }

    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        long m = n;
        return (m & (m - 1)) == 0;
    }
}
