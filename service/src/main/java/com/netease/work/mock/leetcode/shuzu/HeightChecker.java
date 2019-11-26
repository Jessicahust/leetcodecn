package com.netease.work.mock.leetcode.shuzu;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * description:
 * Date: 2019-10-05 下午11:42<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class HeightChecker {

    public int heightChecker(int[] heights) {
        int[] arrs = heights.clone();
        Arrays.sort(arrs);
        int count =0;
        for (int i =0;i<heights.length;++i){
            if (arrs[i] != heights[i]){
                ++count;
            }
        }
        return count;
    }
}
