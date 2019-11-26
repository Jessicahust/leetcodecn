package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-08 下午10:56<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class AddStrings {
    public static void main(String[] args) {
        System.out.println(new AddStrings().addStrings("408","5"));
    }
    public String addStrings(String num1, String num2) {
        if (num1.isEmpty()) {
            return num2;
        }
        if (num2.isEmpty()) {
            return num1;
        }
        String res = "";
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int plus = 0;
        while (i >= 0 && j >= 0) {
            int n1 = num1.charAt(i) - '0';
            int n2 = num2.charAt(j) - '0';
            if (n1 + n2 + plus > 9) {
                int sum = (n1 + n2 + plus) % 10;
                plus = 1;
                res = sum + res;
            } else {
                int sum = (n1 + n2 + plus);
                plus = 0;
                res = sum + res;
            }
            --i;
            --j;
        }
        while (i >= 0) {
            int n2 = num1.charAt(i) - '0';
            if (n2 + plus > 9) {
                int sum = (n2 + plus) % 10;
                plus = 1;
                res = sum + res;
            } else {
                int sum = (n2 + plus);
                plus = 0;
                res = sum + res;
            }
            --i;
        }
        while (j >= 0) {
            int n2 = num2.charAt(j) - '0';
            if (n2 + plus > 9) {
                int sum = (n2 + plus) % 10;
                plus = 1;
                res = sum + res;
            } else {
                int sum = (n2 + plus);
                plus = 0;
                res = sum + res;
            }
            --j;
        }
        if (plus == 1) {
            res = "1" + res;
        }
        return res;
    }
}
