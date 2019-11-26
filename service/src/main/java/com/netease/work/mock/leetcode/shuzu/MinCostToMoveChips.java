package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-27 下午10:03<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MinCostToMoveChips {

    public int minCostToMoveChips(int[] chips) {
        int qishu = 0;
        int oushu = 0;
        for (int i = 0; i < chips.length; ++i) {
            if ((chips[i] & 1) == 0) {
                ++oushu;
            } else {
                ++qishu;
            }
        }
        return qishu > oushu ? oushu : qishu;
    }
}
