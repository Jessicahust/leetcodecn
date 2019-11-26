package com.netease.work.mock.leetcode.shuzu;

import java.util.HashSet;
import java.util.Set;

/**
 * description:
 * Date: 2019-10-19 下午8:20<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class DistributeCandies {

    public static void main(String[] args) {
        new DistributeCandies().distributeCandies(60, 4);
    }

    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int count = 0;
        int index = 0;
        while (true) {
            result[index % num_people] += index + 1;
            count += index + 1;
            if (candies - count <= result[index % num_people]) {
                result[(index + 1) % num_people] += candies - count;
                break;
            }
            ++index;
        }
        return result;
    }

    /**
     * 575
     * @param candies
     * @return
     */
    public int distributeCandies(int[] candies) {
        Set<Integer> candySet = new HashSet<>();
        for (int i = 0; i < candies.length; ++i) {
            candySet.add(candies[i]);
        }
        return candySet.size() >= candies.length / 2 ? candies.length / 2 : candySet.size();
    }
}
