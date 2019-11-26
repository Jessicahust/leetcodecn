package com.netease.work.mock.leetcode.shuzu;

/**
 * description: 121. 买卖股票的最佳时机
 * Date: 2019-09-17 下午10:52<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MaxProfit {

    public static void main(String[] args) {
        System.out.println(new MaxProfit().maxProfit(new int[]{7,6,4,3,1}));
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int maxProfit = prices[0];
        int minProfit = prices[0];
        int grap = maxProfit - maxProfit;
        int maxGrap = grap;
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] > maxProfit) {
                maxProfit = prices[i];
                grap = maxProfit - minProfit;
                if (grap > maxGrap){
                    maxGrap = grap;
                }
            } else if (prices[i] < minProfit) {
                maxProfit = prices[i];
                minProfit = prices[i];
                grap = maxProfit - minProfit;
                if (grap > maxGrap){
                    maxGrap = grap;
                }
            }
        }
        return maxGrap;
    }
}
