package com.netease.work.mock.leetcode.dongtaiguihua;

/**
 * description: 198. 打家劫舍
 * Date: 2019-09-21 下午10:42<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class Rob {

    public static void main(String[] args) {
        System.out.println(new Rob().rob(new int[]{2, 1,1,2}));
    }

    public int rob(int[] nums) {
        int[] arr = new int[nums.length];
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        if (nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        if (nums.length==3){
            return Math.max(nums[0]+nums[2],nums[1]);
        }
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0],nums[1]);
        arr[2] = Math.max(nums[0]+nums[2],nums[1]);
        for (int i = 3; i < nums.length; ++i) {
            arr[i] = Math.max(Math.max(arr[i - 2] + nums[i], arr[i - 3] + nums[i]), nums[i - 1]);
        }
        return Math.max(arr[nums.length - 1], arr[nums.length - 2]);
    }
}
