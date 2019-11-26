package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-16 下午6:17<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(new ClimbStairs().climbStairs(5));
    }
    public int climbStairs(int n) {
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        int a1 = 1;
        int a2 = 2;
        int i = 3;
        while (i <=n){
            int sum = a1 + a2;
            a1 = a2;
            a2 = sum;
            ++i;
        }
        return a2;
    }
}
