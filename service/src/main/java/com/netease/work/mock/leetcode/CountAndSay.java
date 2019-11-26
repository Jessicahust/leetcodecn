package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-15 下午11:43<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class CountAndSay {

    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(5));
    }

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String pre = "1";
        for (int i = 2; i <= n; ++i) {
            String tmp = "";
            int t = 0;
            int j = 0;
            while (j < pre.length()) {
                if (pre.charAt(t) != pre.charAt(j)) {
                    tmp = tmp + (j - t) + pre.charAt(t);
                    t = j;
                }
                ++j;
            }
            tmp = tmp + (pre.length() - t) + pre.charAt(t);
            pre = tmp;
        }
        return pre;
    }
}
