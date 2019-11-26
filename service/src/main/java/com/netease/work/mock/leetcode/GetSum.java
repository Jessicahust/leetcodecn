package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-25 下午9:30<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class GetSum {
    public static void main(String[] args) {
        System.out.println(new GetSum().getSum(1,2));
    }
    public int getSum(int a, int b) {
        if (b == 0){
            return a;
        }
        return getSum(a^b,(a&b)<<1);
    }
}
