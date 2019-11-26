package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-27 下午5:54<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class LemonadeChange {
    public static void main(String[] args) {
        System.out.println(new LemonadeChange().lemonadeChange(new int[]{5,5,5,20}));
    }

    public boolean lemonadeChange(int[] bills) {
        int count5 = 0;
        int count10 = 0;
        for (int i = 0; i < bills.length; ++i) {
            if (bills[i] == 5) {
                ++count5;
            } else if (bills[i] == 10) {
                if (count5 < 1) {
                    return false;
                }
                count5--;
                count10++;
            } else {
                if (count5 < 1) {
                    return false;
                }
                if (count10 >= 1) {
                    --count10;
                    --count5;
                } else if (count5 >= 3) {
                    count5 = count5 - 3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
