package com.netease.work.mock.leetcode.erfenfa;

/**
 * description:
 * Date: 2019-09-28 下午11:01<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] ints = new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(ints[0]+" "+ints[1]);
    }
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        int start = 0;
        int end = numbers.length-1;
        while (start<end){
            int sum = numbers[start] + numbers[end];
            if (sum == target){
                result[0] = start+1;
                result[1] = end+1;
                return result;
            }
            if (sum<target){
                ++start;
            }else {
                --end;
            }
        }
        return result;
    }
}
