package com.netease.work.mock.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Date: 2019-09-23 下午11:10<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsHappy {
    public static void main(String[] args) {
        System.out.println(new IsHappy().isHappy(1));
    }

    public boolean isHappy(int n) {
        List<Integer> arr = new ArrayList<>();
        arr.add(n);
        int sum = 0;
        while (sum != 1) {
            Integer num = arr.get(arr.size() - 1);
            sum = 0;
            while (num != 0) {
                sum += (num % 10) * (num % 10);
                num /= 10;
            }
            if (sum == 1) {
                return true;
            }
            if (arr.contains(sum)) {
                return false;
            }
            arr.add(sum);
        }
        return true;
    }
}
