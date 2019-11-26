package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-20 下午8:08<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumber(new int[]{4,1,2,1,2}));
    }

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i =0 ;i<nums.length;++i){
            result = result ^ nums[i];
        }
        return result;
    }
}
