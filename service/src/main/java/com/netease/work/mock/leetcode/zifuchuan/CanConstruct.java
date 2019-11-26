package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-02 下午8:16<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class CanConstruct {
    public static void main(String[] args) {
        System.out.println(new CanConstruct().canConstruct("a", "b"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < ransomNote.length(); ++i) {
            ++arr1[ransomNote.charAt(i) - 'a'];
        }
        for (int i = 0; i < magazine.length(); ++i) {
            ++arr2[magazine.charAt(i) - 'a'];
        }
        for (int i = 0; i < 26; ++i) {
            if (arr1[i] > arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
