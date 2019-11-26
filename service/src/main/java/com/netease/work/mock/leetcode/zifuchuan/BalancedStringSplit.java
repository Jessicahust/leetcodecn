package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-13 下午2:36<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class BalancedStringSplit {

    public int balancedStringSplit(String s) {
        int countR = 0;
        int countL = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'R') {
                ++countR;
            } else {
                ++countL;
            }
            if (countL == countR) {
                ++sum;
                countL = 0;
                countR = 0;
            }
        }
        if (countR != 0 && (countL == countR)) {
            ++sum;
        }
        return sum;
    }
}
