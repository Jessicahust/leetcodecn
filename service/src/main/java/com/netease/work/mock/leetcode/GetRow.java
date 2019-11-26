package com.netease.work.mock.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Date: 2019-09-28 下午10:43<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class GetRow {

    public static void main(String[] args) {
        System.out.println(new GetRow().getRow(3));
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        if (rowIndex == 0) {
            return result;
        }
        for (int i = 1; i <= rowIndex; ++i) {
            List<Integer> line = new ArrayList<>();
            line.add(1);
            for (int j = 0; j < result.size() - 1; ++j) {
                line.add(result.get(j) + result.get(j + 1));
            }
            line.add(1);
            result = line;
        }
        return result;
    }
}
