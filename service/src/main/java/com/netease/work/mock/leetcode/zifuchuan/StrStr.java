package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-09-26 下午1:11<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class StrStr {
    public static void main(String[] args) {
        System.out.println(new StrStr().strStr("hello", "lo"));
    }

    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); ++i) {
            int k = i;
            int j = 0;
            while (j<needle.length()){
                if (haystack.charAt(k) == needle.charAt(j)){
                    ++k;
                    ++j;
                    continue;
                }
                break;
            }
            if (j == needle.length()){
                return i;
            }
        }
        return -1;
    }
}
