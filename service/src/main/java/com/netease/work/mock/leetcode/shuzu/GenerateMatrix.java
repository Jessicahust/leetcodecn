package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-07 下午5:10<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class GenerateMatrix {

    public int[][] generateMatrix(int n) {
        int i = 0;
        int j = 0;
        int index = 1;
        int xmin = 0;
        int xmax = n-1;
        int ymin = 0;
        int ymax = n-1;
        int[][] arr = new int[n][n];
        arr[i][j] = index++;
        while (index <= n*n){
            while (j<xmax){
                arr[i][++j] = index++;
            }
            if (++ymin > ymax){
                break;
            }
            while (i<ymax){
                arr[++i][j] = index++;
            }
            if (--xmax < xmin){
                break;
            }
            while (j>xmin){
                arr[i][--j] = index++;
            }
            if (--ymax<ymin){
                break;
            }
            while (i>ymin){
                arr[--i][j] = index++;
            }
            if (++xmin>xmax){
                break;
            }
        }
        return arr;
    }
}
