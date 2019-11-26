package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-10-02 下午5:36<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsPowerOfFour {

    public boolean isPowerOfFour(int num) {
        if(num == 1){
            return true;
        }
        return (num & (num - 1)) == 0 && (num%3 == 1);
    }
}
