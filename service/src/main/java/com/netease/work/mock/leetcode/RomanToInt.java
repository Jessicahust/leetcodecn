package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-25 下午11:08<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(new RomanToInt().romanToInt("IV"));
    }

    public int romanToInt(String s) {
        int[] arr = new int[26];
        arr['I' - 'A'] = 1;
        arr['V' - 'A'] = 5;
        arr['X' - 'A'] = 10;
        arr['L' - 'A'] = 50;
        arr['C' - 'A'] = 100;
        arr['D' - 'A'] = 500;
        arr['M' - 'A'] = 1000;

        int sum = 0;
        s = s + s.charAt(s.length() - 1);
        for (int i = 0; i < s.length() - 1; ++i) {
            if (arr[s.charAt(i) - 'A'] >= arr[s.charAt(i + 1) - 'A']) {
                sum += arr[s.charAt(i) - 'A'];
            } else {
                sum -= arr[s.charAt(i) - 'A'];
            }
        }
        return sum;
    }
}
