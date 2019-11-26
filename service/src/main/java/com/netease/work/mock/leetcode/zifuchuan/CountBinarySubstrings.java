package com.netease.work.mock.leetcode.zifuchuan;

import java.util.Arrays;

/**
 * description:
 * Date: 2019-11-18 下午11:58<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class CountBinarySubstrings {

    public int countBinarySubstrings(String s) {
        int count = 0;
        /*for (int i = 0; i < s.length(); ++i) {
            for (int size = 2; i + size <= s.length(); size += 2) {
                String substring = s.substring(i, i + size);
                int len = size / 2;
                String pre = substring.substring(0, len);
                String post = substring.substring(len);
                char[] chars = new char[len];
                Arrays.fill(chars, '0');
                String zero = new String(chars);
                char[] chars1 = new char[len];
                Arrays.fill(chars1, '1');
                String one = new String(chars1);
                if (zero.equals(pre) && one.equals(post) || zero.equals(post) && one.equals(pre)) {
                    ++count;
                }
            }
        }*/
        int cur = 1;
        int last = 0;
        for (int i = 0;i<s.length()-1;++i){
            if (s.charAt(i) == s.charAt(i+1)){
                ++cur;
            }else {
                last = cur;
                cur = 1;
            }
            if (last >=cur){
                ++count;
            }
        }

        return count;
    }
}
