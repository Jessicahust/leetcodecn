package com.netease.work.mock.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Date: 2019-09-25 下午10:07<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(new FizzBuzz().fizzBuzz(15));
    }

    public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<>();
        for (int i = 1;i<=n;++i){
            if (i%3==0 &&i%5==0){
                ret.add("FizzBuzz");
            }else if (i%3==0){
                ret.add("Fizz");
            }else if (i%5==0){
                ret.add("Buzz");
            }else {
                ret.add(i+"");
            }
        }
        return ret;
    }
}
