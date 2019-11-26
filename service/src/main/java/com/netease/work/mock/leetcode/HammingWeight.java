package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-23 下午10:44<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class HammingWeight {

    public static void main(String[] args) {
        System.out.println(new HammingWeight().hammingWeight(2));
    }
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum =0;
        while (n!=0){
            ++sum;
            n = n&(n-1);
        }
        return sum;
    }
}
