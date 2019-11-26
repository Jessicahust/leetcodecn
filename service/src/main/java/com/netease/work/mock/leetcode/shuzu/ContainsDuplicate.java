package com.netease.work.mock.leetcode.shuzu;

import java.util.HashSet;
import java.util.Set;

/**
 * description:
 * Date: 2019-09-24 下午11:44<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1,2,3,1}));
    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ;i<nums.length;++i){
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
