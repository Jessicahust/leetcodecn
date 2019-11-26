package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-09-23 下午10:01<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class Rotate {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        new Rotate().rotate(nums,3);
        for (int i = 0 ;i<nums.length;++i){
            System.out.println(nums[i]);
        }
    }
    public void rotate(int[] nums, int k) {
        if (nums.length == 0){
            return;
        }
        k = k % nums.length;
        int i = 0;
        int j = nums.length-1;
        while (i<j){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            ++i;
            --j;
        }
        i = 0;
        j = k-1;
        while (i<j){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            ++i;
            --j;
        }

        i = k;
        j = nums.length-1;
        while (i<j){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            ++i;
            --j;
        }
    }
}
