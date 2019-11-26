package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-16 上午12:35<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] ints = new PlusOne().plusOne(new int[]{9, 9, 9});
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int[] ret = new int[length + 1];
        int plus = 1;
        for (int i = digits.length - 1; i >= 0; --i) {
            int sum = digits[i]  + plus;
            if (sum > 9) {
                plus = 1;
                ret[i + 1] = sum % 10;
            } else {
                plus = 0;
                ret[i + 1] = sum;
            }
        }
        if (plus == 1) {
            ret[0] = 1;
        } else {
            for (int i = 0; i < digits.length; ++i) {
                digits[i] = ret[i+1];
            }
            return digits;
        }
        return ret;
    }
}
