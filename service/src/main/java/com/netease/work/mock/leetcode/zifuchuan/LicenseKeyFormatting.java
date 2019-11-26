package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-11-17 下午5:04<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class LicenseKeyFormatting {
    public static void main(String[] args) {
        System.out.println(new LicenseKeyFormatting().licenseKeyFormatting("---",4));
    }
    public String licenseKeyFormatting(String S, int K) {
        String s = S.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();
        int len = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            char c = s.charAt(i);
            if (c == '-') {
                continue;
            }
            if (len == K) {
                stringBuilder.append("-");
                len = 0;
            }
            ++len;
            stringBuilder.append(c);
        }
        StringBuilder reverse = stringBuilder.reverse();
        return reverse.toString();
    }
}
