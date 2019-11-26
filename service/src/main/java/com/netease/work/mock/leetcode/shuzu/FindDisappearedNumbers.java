package com.netease.work.mock.leetcode.shuzu;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Date: 2019-09-22 上午12:58<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FindDisappearedNumbers {

    public static void main(String[] args) {
        List<Integer> disappearedNumbers = new FindDisappearedNumbers().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(disappearedNumbers);
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; ) {
            if (i + 1 != nums[i] && nums[i] != nums[nums[i] - 1]) {
                int tmp = nums[i];
                nums[i] = nums[tmp - 1];
                nums[tmp - 1] = tmp;
            } else {
                ++i;
            }
        }
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != i + 1) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
