package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-09-23 上午1:31<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] ch = new char[]{'a','b','h','c'};
        new ReverseString().reverseString(ch);
        for (int i =0;i<ch.length;++i){
            System.out.println(ch[i]);
        }
    }
    public void reverseString(char[] s) {
        if (s.length == 0){
            return;
        }
        int i =0;
        int j = s.length-1;
        while (i<j){
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            ++i;
            --j;
        }
    }
}
