package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-09-26 下午9:52<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord("hello world! "));
    }

    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        String trim = s.trim();
        for (int i = trim.length() - 1; i >= 0; --i) {
            if (trim.charAt(i) != ' ') {
                ++count;
            }else {
                break;
            }
        }
        return count;
    }
}
