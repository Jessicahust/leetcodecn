package com.netease.work.mock.leetcode.zifuchuan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * description:
 * Date: 2019-09-22 下午4:34<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FindAnagrams {

    public static void main(String[] args) {
        System.out.println(new FindAnagrams().findAnagrams("abab","a"));
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int length = p.length();
        char[] chars = p.toCharArray();
        Arrays.sort(chars);
        String p1 = new String(chars);
        for (int i = 0;i<=s.length()-p.length();++i){
            String substring = s.substring(i, i + length);
            char[] chars1 = substring.toCharArray();
            Arrays.sort(chars1);
            if (new String(chars1).equals(p1)){
                result.add(i);
            }
        }
        return result;
    }
}
