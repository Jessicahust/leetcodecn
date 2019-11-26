package com.netease.work.mock.leetcode.shuzu;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Date: 2019-10-27 下午3:55<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FindJudge {

    public static void main(String[] args) {
        System.out.println(new FindJudge().findJudge(3,new int[2][2]));
    }
    public int findJudge(int N, int[][] trust) {
        if(N==1){
            return -1;
        }
        if (trust[0].length!=2){
            return -1;
        }
        List<Integer> judge = new ArrayList<>();
        int pre = trust[0][1];
        for (int i =0;i<N-1;++i){
            if (pre != trust[i][1]){
                return -1;
            }
            if (trust[i][0] == pre){
                return -1;
            }
        }
        return pre;
    }
}
