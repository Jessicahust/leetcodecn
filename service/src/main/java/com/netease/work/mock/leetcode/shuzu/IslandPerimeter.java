package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-11-02 下午5:19<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IslandPerimeter {
    public static void main(String[] args) {
        System.out.println(new IslandPerimeter().islandPerimeter(new int[3][4]));
    }

    public int islandPerimeter(int[][] grid) {
        int length = grid.length;
        if (length == 0) {
            return 0;
        }
        int width = grid[0].length;
        if (width == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; ++j) {
                if (grid[i][j] == 1){
                    if (i==0 || grid[i-1][j] == 0){
                        ++count;
                    }
                    if (j == 0 || grid[i][j-1] == 0){
                        ++count;
                    }
                }
            }
        }
        return 2*count;
    }
}
