package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-08-16 下午11:39<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        boolean palindrome = new PalindromeNumber().isPalindrome(121);
        System.out.println(palindrome);
    }


    public boolean isPalindrome(int x) {
        String str = x+"";
        int i =0;
        int j = str.length()-1;
        while (i<str.length()/2){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }
}
