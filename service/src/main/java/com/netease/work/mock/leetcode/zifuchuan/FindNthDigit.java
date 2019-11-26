package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-02 下午8:56<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FindNthDigit {
    public static void main(String[] args) {
        System.out.println(new FindNthDigit().findNthDigit(1000000));
    }

    public int findNthDigit(int n) {
        String str = "";
        int i = 1;
        while (i < Math.pow(2, 31)) {
            str += i;
            ++i;
            if (str.length() > n) {
                break;
            }
        }
        return str.charAt(n - 1) - '1' + 1;
    }
}
