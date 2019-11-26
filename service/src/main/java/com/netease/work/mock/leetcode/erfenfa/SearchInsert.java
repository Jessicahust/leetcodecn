package com.netease.work.mock.leetcode.erfenfa;

/**
 * description: 	35 搜索插入位置
 * Date: 2019-09-26 下午9:16<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class SearchInsert {
    public static void main(String[] args) {
        System.out.println(new SearchInsert().searchInsert(new int[]{1,3,5,6}, 7));
    }

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (end + start) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
