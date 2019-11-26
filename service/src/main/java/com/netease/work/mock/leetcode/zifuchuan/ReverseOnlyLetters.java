package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-28 下午10:26<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
    public String reverseOnlyLetters(String S) {
        if (S.length() == 0) {
            return "";
        }
        int left = 0;
        int right = S.length() - 1;
        char[] chars = S.toCharArray();
        while (left < right) {
            while (left < right && !isAlp(S.charAt(left))) {
                ++left;
            }
            while (left < right && !isAlp(S.charAt(right))) {
                --right;
            }
            if (left < right) {
                char ch = chars[left];
                chars[left] = chars[right];
                chars[right] = ch;
                ++left;
                --right;
            }
        }
        return new String(chars);
    }

    private boolean isAlp(char ch) {
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            return true;
        }
        return false;
    }
}
