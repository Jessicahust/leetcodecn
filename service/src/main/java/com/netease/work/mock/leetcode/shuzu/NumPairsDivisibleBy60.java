package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-11-18 下午8:35<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class NumPairsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        /*for (int i = 0; i < time.length; ++i) {
            for (int j = i + 1; j < time.length; ++j) {
                long sum = time[i] + time[j];
                if (sum % 60 == 0){
                    ++count;
                }
            }
        }*/
        int[] mod = new int[60];
        for (int i = 0; i < time.length; ++i) {
            int index = time[i] % 60;
            if (index == 0){
                count += mod[0];
            }else {
                count += mod[60-index];
            }
            mod[index]++;
        }
        return count;
    }
}
