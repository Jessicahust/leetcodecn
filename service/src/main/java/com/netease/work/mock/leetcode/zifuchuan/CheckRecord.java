package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-27 下午10:20<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class CheckRecord {

    public boolean checkRecord(String s) {
        if (s.length() == 0) {
            return true;
        }
        char pre = ' ';
        int countA = 0;
        int countL = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'P') {

            } else if (s.charAt(i) == 'A') {
                ++countA;
                if (countA > 1) {
                    return false;
                }
            } else if (s.charAt(i) == 'L') {
                if (pre == s.charAt(i)) {
                    ++countL;
                    if (countL > 2) {
                        return false;
                    }
                } else {
                    countL = 1;
                }
            }
            pre = s.charAt(i);
        }
        return true;
    }
}
