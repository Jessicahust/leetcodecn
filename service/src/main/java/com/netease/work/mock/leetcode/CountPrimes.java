package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-23 下午11:45<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class CountPrimes {

    public static void main(String[] args) {
        System.out.println(new CountPrimes().countPrimes1(499979));
    }

    public int countPrimes(int n) {
        int sum = 0;
        if (n == 1) {
            return 0;
        }
        for (int i = 2; i < n; ++i) {
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    break;
                }
                ++j;
            }
            if (j == i) {
                ++sum;
            }
        }
        return sum;
    }

    public int countPrimes1(int n) {
        int sum = 0;
        if (n==0 || n == 1 || n==2) {
            return 0;
        }
        int[] arr = new int[n];
        arr[0] = arr[1] = 1;
        for (int i = 2; i < n; ++i) {
            if (arr[i] == 0){
                ++sum;
            }
            for (long j = i; j * i < n; ++j) {
                int index = (int) (i * j);
                arr[index] = 1;
            }
        }
        return sum;
    }
}
