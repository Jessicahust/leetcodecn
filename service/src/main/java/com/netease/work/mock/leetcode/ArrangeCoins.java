package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-10-26 下午11:12<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(new ArrangeCoins().arrangeCoins(2147483647));
    }

    public int arrangeCoins(int n) {
        long count = 0;
        long line = 0;
        long tmp = n;
        while (count < tmp) {
            if (count + line + 1 <= tmp) {
                ++line;
                count += line;
            }else {
                break;
            }
        }
        return (int) line;
    }
}
