package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-26 下午5:15<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class DistanceBetweenBusStops {
    public static void main(String[] args) {
        System.out.println(new DistanceBetweenBusStops().distanceBetweenBusStops(new int[]{1,2,3,4},0,2));
    }
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum = 0;
        for (int i = 0 ; i <distance.length;++i){
            sum += distance[i];
        }
        int right = 0;
        for (int j = Math.min(start,destination) ;j<Math.max(start,destination);++j){
            right += distance[j%distance.length];
        }
        return Math.min(right,sum-right);
    }
}
