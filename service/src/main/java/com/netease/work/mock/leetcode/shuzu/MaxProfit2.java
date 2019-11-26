package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-09-26 下午8:21<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MaxProfit2 {
    public static void main(String[] args) {
        System.out.println(new MaxProfit2().maxProfit(new int[]{1,2,3,4,5}));
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int sum = 0;
        int preBuy = prices[0];
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] > preBuy) {
                sum += prices[i] - preBuy;
            }
            preBuy = prices[i];
        }
        return sum;
    }
}
