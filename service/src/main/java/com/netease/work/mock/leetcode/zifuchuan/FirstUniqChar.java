package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-09-25 下午10:01<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FirstUniqChar {
    public static void main(String[] args) {
        System.out.println(new FirstUniqChar().firstUniqChar("loveleetcode"));
    }

    public int firstUniqChar(String s) {
        int[] a1 = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            a1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); ++i) {
            if (a1[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
