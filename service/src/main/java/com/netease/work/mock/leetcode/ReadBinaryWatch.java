package com.netease.work.mock.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 401. 二进制手表
 * Date: 2019-10-26 下午5:04<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ReadBinaryWatch {
    public static void main(String[] args) {
        System.out.println(new ReadBinaryWatch().readBinaryWatch(1));
    }
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        for (int i = 0;i<12;++i){
            for (int j = 0;j<60;++j){
                if (count(i) + count(j) == num){
                    res.add(i+":"+((j<10)?"0"+j:j));
                }
            }
        }
        return res;
    }

    private int count(int n ){
        int res = 0;
        while (n!=0){
            n = n & (n-1);
            ++res;
        }
        return res;
    }
}
