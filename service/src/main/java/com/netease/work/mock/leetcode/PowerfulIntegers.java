package com.netease.work.mock.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * description:
 * Date: 2019-11-18 下午7:49<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class PowerfulIntegers {

    public static void main(String[] args) {
        System.out.println(new PowerfulIntegers().powerfulIntegers(2, 1, 10));
    }

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> ret = new HashSet<>();
        int i = 0;
        while (true) {
            double sum = Math.pow(x, i);
            double tmp = sum;
            if ((int) sum > bound) {
                break;
            }
            int j = 0;
            while (true) {
                sum = Math.pow(y, j) + sum;
                if ((int) sum > bound) {
                    break;
                }
                ++j;
                ret.add((int) sum);
                sum = tmp;
                if (y == 1){
                    break;
                }
            }
            ++i;
            if (x == 1){
                break;
            }
        }

        return new ArrayList<>(ret);
    }
}
