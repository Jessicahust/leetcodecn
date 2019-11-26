package com.netease.work.mock.leetcode.shuzu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * description:
 * Date: 2019-11-17 上午12:15<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MinimumAbsDifference {

    public static void main(String[] args) {
        System.out.println(new MinimumAbsDifference().minimumAbsDifference(new int[]{4,2,1,3}));
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minSub = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i + 1] - arr[i] < minSub) {
                minSub = arr[i + 1] - arr[i];
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length-1; ++i) {
            if (arr[i+1] - arr[i] == minSub){
                List<Integer> ret = new ArrayList<>();
                ret.add(arr[i]);
                ret.add(arr[i+1]);
                result.add(ret);
            }
        }
        return result;
    }
}
