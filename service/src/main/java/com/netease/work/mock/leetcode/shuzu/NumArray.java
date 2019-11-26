package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-02 下午4:45<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class NumArray {

    int[] arr ;

    public NumArray(int[] nums) {
        arr = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        int index = i;
        while (index<=j){
            sum += arr[index];
            ++index;
        }
        return sum;
    }
}
