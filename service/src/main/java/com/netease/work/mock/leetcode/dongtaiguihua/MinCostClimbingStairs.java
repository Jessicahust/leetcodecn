package com.netease.work.mock.leetcode.dongtaiguihua;

/**
 * description:
 * Date: 2019-10-09 下午11:07<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        System.out.println(new MinCostClimbingStairs().minCostClimbingStairs(new int[]{10, 15, 20}));
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] arr = new int[cost.length];
        if (cost.length == 0){
            return 0;
        }
        if (cost.length == 1){
            return cost[0];
        }
        if (cost.length == 2){
            return Math.min(cost[0],cost[1]);
        }
        arr[0] = cost[0];
        arr[1] = cost[1];
        for (int i = 2;i<cost.length;++i){
            arr[i] = Math.min(arr[i-1]+cost[i],arr[i-2]+cost[i]);
        }
        return Math.min(arr[arr.length-1],arr[arr.length-2]);
    }
}
