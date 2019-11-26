package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-11-02 下午10:17<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class RotateString {

    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.length() == 0){
            return true;
        }
        int len = A.length();
        for (int i = 0; i < len; ++i) {
            boolean isRotate = true;
            for (int j = 0; j < len; ++j) {
                if (A.charAt((i + j) % len) != B.charAt(j)) {
                    isRotate = false;
                    break;
                }
            }
            if (isRotate) {
                return true;
            }
        }
        return false;
    }
}
