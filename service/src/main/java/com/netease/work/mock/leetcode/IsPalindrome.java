package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-17 下午11:31<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome("0P"));
    }

    public boolean isPalindrome(String s) {
        if (s == null || s.length()==0){
            return true;
        }
        int i = 0;
        int j = s.length()-1;
        String str = s.toLowerCase();
        while (i<j){
            while (i<j &&(str.charAt(i)>'z' ||str.charAt(i)<'0'||(str.charAt(i)<'a' && str.charAt(i)>'9'))){
                ++i;
            }
            while (i<j &&(str.charAt(j)>'z' ||str.charAt(j)<'0'||(str.charAt(j)<'a' && str.charAt(j)>'9'))){
                --j;
            }
            if (i>=j){
                break;
            }
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }
}
