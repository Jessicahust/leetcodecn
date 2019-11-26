package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-11-02 下午8:34<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class RepeatedSubstringPattern {


    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1,s.length()*2-1).indexOf(s) != -1;
    }
}
