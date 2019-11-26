package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-11-02 下午8:49<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class NumberOfLines {

    public int[] numberOfLines(int[] widths, String S) {
        if (S.length() == 0){
            return new int[]{0,0};
        }
        int line = 1;
        int lastLine = 0;
        for (int i = 0; i < S.length(); ++i) {
            int count = widths[S.charAt(i) - 'a'];
            if (lastLine + count <= 100) {
                lastLine += count;
            } else {
                ++line;
                lastLine = count;
            }
        }
        int[] ret = new int[]{line, lastLine};
        return ret;
    }
}
