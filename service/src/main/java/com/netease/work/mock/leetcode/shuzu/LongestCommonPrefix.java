package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-09-15 下午10:08<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"d","d","docar"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String shortStr = strs[0];
        for (String str : strs) {
            if (str.length() < shortStr.length()) {
                shortStr = str;
            }
        }
        String prefix = "";
        for (int i = 0; i < shortStr.length(); ++i) {
            char c = shortStr.charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != c) {
                    return prefix;
                }
            }
            prefix = prefix + c;
        }
        return prefix;
    }
}
