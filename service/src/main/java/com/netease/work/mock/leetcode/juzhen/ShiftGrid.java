package com.netease.work.mock.leetcode.juzhen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * description:
 * Date: 2019-11-17 下午4:21<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ShiftGrid {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);

        new ShiftGrid().reverse(arr,2);
        System.out.println(arr);
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        if (grid.length == 0 || grid[0].length == 0) {
            return null;
        }
        int len = grid.length;
        int wide = grid[0].length;
        List<List<Integer>> ret = new ArrayList<>(len);
        List<Integer> line = new ArrayList<>();
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < wide; ++j) {
                line.add(grid[i][j]);
            }
        }
        reverse(line,k);
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < line.size(); ++i) {
            if (x.size() == wide){
                ret.add(x);
                x = new ArrayList<>();
            }
            x.add(line.get(i));
        }
        ret.add(x);
        return ret;
    }

    public void reverse(List<Integer> line, int k) {
        k = k % line.size();
        Collections.reverse(line.subList(0, line.size() - k ));
        Collections.reverse(line.subList(line.size() - k , line.size()));
        Collections.reverse(line);
    }
}
