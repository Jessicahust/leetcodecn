package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-06 下午10:47<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ReverseWords {

    public String reverseWords(String s) {
        int i = 0;
        int j = 0;
        int head = 0;
        int tail = 0;
        char[] chars = s.toCharArray();
        while (j < s.length()) {
            while (j < s.length() && chars[j] != ' ') {
                ++j;
            }
            tail = j;
            j = j - 1;
            while (i < j) {
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                ++i;
                --j;
            }
            i = tail + 1;
            j = tail + 1;
        }
        return new String(chars);
    }

}
