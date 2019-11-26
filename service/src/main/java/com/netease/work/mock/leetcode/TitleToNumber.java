package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-26 下午1:04<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class TitleToNumber {

    public static void main(String[] args) {
        System.out.println(new TitleToNumber().titleToNumber("AB"));
    }

    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); ++i) {
            sum = sum * 26 + s.charAt(i) - 'A' + 1;
        }
        return sum;
    }
}
