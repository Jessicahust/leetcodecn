package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-25 下午10:45<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsPowerOfThree {
    public static void main(String[] args) {
        System.out.println(new IsPowerOfThree().isPowerOfThree(6));
    }
    public boolean isPowerOfThree(int n) {
        if (n == 0){
            return false;
        }
        while (n!=1){
            if (n%3!=0){
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
