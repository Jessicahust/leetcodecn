package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-09-26 下午10:28<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("101111", "10"));
    }

    public String addBinary(String a, String b) {
        String result = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        String pre = "0";
        while (i >= 0 && j >= 0) {
            if (a.charAt(i) == '1' && b.charAt(j) == '1') {
                result = pre + result;
                pre = "1";
            } else if (a.charAt(i) == '1' || b.charAt(j) == '1') {
                if (pre.equals("1")) {
                    result = "0" + result;
                } else {
                    result = "1" + result;
                }
            } else {
                result = pre + result;
                pre = "0";
            }
            --i;
            --j;
        }
        if (i < 0 && j < 0) {
            if (pre.equals("1")) {
                result = pre + result;
            }
        } else if (i < 0) {
            while (j >= 0) {
                if (pre.equals("1") && b.charAt(j) == '1') {
                    result = "0" + result;
                } else {
                    String tmp = b.charAt(j) + "";
                    result = (tmp.compareTo(pre) > 0 ? tmp : pre) + result;
                    pre = "0";
                }
                --j;
            }
            if (pre.equals("1")) {
                result = pre + result;
            }
        } else if (j < 0) {
            while (i >= 0) {
                if (pre.equals("1") && a.charAt(i) == '1') {
                    result = "0" + result;
                } else {
                    String tmp = a.charAt(i) + "";
                    result = (tmp.compareTo(pre) > 0 ? tmp : pre) + result;
                    pre = "0";
                }
                --i;
            }
            if (pre.equals("1")) {
                result = pre + result;
            }
        }
        return result;
    }
}
