package com.netease.work.mock.leetcode;


/**
 * description:
 * Date: 2019-08-15 下午10:51<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse((int)(Math.pow(2,31)-1)));
    }

    public int reverse(int x) {
        String str = x + "";
        int length = str.length();
        int flag = 1;
        if (x < 0) {
            flag = -1;
            x = Math.abs(x);
            length = length - 1;
        }
        long sum = 0;
        int i = length - 1;
        while (i >= 0) {
            int v1 = (int) (x / Math.pow(10, i));
            int v2 = (int) (x % Math.pow(10, i));
            sum += v1 * Math.pow(10, length - i - 1);
            x = v2;
            --i;
        }
        sum = sum * flag;
        return sum < Math.pow(-2, 31) || sum > Math.pow(2, 31) - 1 ? 0 : (int) sum;
    }
}
