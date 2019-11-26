package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-27 下午6:18<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class HasGroupsSizeX {
    public static void main(String[] args) {
        System.out.println(new HasGroupsSizeX().hasGroupsSizeX(new int[]{1,2,3,4,4,3,2,1}));
    }

    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length < 1) {
            return false;
        }
        int[] ints = new int[10000];
        for (int i = 0; i < deck.length; ++i) {
            ints[deck[i]]++;
        }
        int num = ints[deck[0]];
        for (int i = 0; i < ints.length; ++i) {
            if (ints[i] == 0) {
                continue;
            }
            int gcd = GCD(num, ints[i]);
            if (gcd == 1) {
                return false;
            }
            num = gcd;
        }
        return true;
    }

    private int GCD(int n1, int n2) {
        int temp;
        if (n1 < n2) {
            //交换
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        while (n1 % n2 != 0) {
            temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }
        return n2;
    }
}
