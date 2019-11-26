package com.netease.work.mock.leetcode.shuzu;

import java.util.Arrays;

/**
 * description:
 * Date: 2019-10-08 下午8:50<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        int len = stones.length;
        if(len == 0)
            return 0;
        if(len == 1)
            return stones[0];
        Arrays.sort(stones);//排序
        if(len == 2){
            return stones[1]-stones[0];
        }
        while(stones[len-2]!=0){
            stones[len-1] = stones[len-1] - stones[len-2];
            stones[len-2] = 0;
            Arrays.sort(stones);//排序
        }
        return stones[len-1];
    }
}
