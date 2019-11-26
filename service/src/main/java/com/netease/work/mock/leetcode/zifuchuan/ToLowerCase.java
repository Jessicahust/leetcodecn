package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-02 下午10:39<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ToLowerCase {
    public static void main(String[] args) {
        System.out.println(new ToLowerCase().toLowerCase("HHH"));
    }

    public String toLowerCase(String str) {
        String res = "";
        if (str == null || str.length() == 0) {
            return str;
        }
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                res += (char)('a' + str.charAt(i) - 'A');
            }else {
                res += str.charAt(i);
            }
        }
        return res;
    }
}
