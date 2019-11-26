package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-15 下午11:22<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicates().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        int length = nums.length;
        int repeat = 0;
        for (int i = 1 ;i<nums.length ; ++i){
            if (nums[i-1] == nums[i]){
                ++repeat;
            }
            nums[i-repeat] = nums[i];
        }
        return length -repeat;
    }
}
