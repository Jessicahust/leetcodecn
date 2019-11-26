package com.netease.work.mock.leetcode.erfenfa;

/**
 * description:
 * Date: 2019-10-28 下午10:44<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class Search {

    public int search(int[] nums, int target) {
        if (nums.length == 0){
            return -1;
        }
        long left = 0;
        long right = nums.length -1;
        while (left <= right){
            long mid = (left + right)/2;
            if (nums[(int)mid] == target){
                return (int)mid;
            }else if (nums[(int)mid] < target){
                left = mid + 1;
            }else {
                right = mid -1;
            }
        }
        return -1;
    }
}
