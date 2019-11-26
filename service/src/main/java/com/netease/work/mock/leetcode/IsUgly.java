package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-10-02 下午3:07<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsUgly {

    public static void main(String[] args) {
        System.out.println(new IsUgly().isUgly(6));
    }
    public boolean isUgly(int num) {
        if (num == 0){
            return false;
        }
        int tmp = num;
        while (num != 1) {
            while (tmp % 2 == 0) {
                tmp /= 2;
            }
            while (tmp % 3 == 0) {
                tmp /= 3;
            }
            while (tmp % 5 == 0) {
                tmp /= 5;
            }
            if (num == tmp) {
                break;
            }
            num = tmp;
        }
        return num == 1;
    }
}
