package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-20 下午4:35<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 0) {
            return n == 0;
        }
        if (flowerbed.length == 1) {
            return flowerbed[0] == 1 ? n == 0 : n <= 1;
        }
        int count = 0;
        for (int i = 0; i < flowerbed.length; ++i) {
            if (flowerbed[i] == 1) {
                continue;
            } else if (flowerbed[i] == 0) {
                if (i == 0) {
                    if (flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        ++count;
                    }
                } else if (i == flowerbed.length - 1) {
                    if (flowerbed[i - 1] == 0) {
                        flowerbed[i] = 1;
                        ++count;
                    }
                } else if (flowerbed[i - 1] == 1 || flowerbed[i + 1] == 1) {
                    continue;
                } else {
                    flowerbed[i] = 1;
                    ++count;
                }
            }
        }
        if (count >= n) {
            return true;
        }
        return false;
    }
}
