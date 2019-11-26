package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-19 下午5:26<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ReverseVowels {

    public static void main(String[] args) {
        System.out.println(new ReverseVowels().reverseVowels("eo"));
    }

    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        String str = "aeiouAEIOU";
        while (left < right) {
            while (left < right && str.indexOf(s.charAt(left)) == -1) {
                ++left;
            }
            while (left < right && str.indexOf(s.charAt(right)) == -1) {
                --right;
            }
            if (left < right) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                ++left;
                --right;
            }
        }
        return new String(chars);
    }
}
