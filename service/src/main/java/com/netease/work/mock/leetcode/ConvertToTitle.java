package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-28 下午11:19<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ConvertToTitle {
    public static void main(String[] args) {
        System.out.println(new ConvertToTitle().convertToTitle(701));
    }

    public String convertToTitle(int n) {
        String result = "";
        char[] arr = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        while (n != 0) {
            int index = (--n) % 26;
            result = arr[index] + result;
            n = n / 26;
        }
        return result;
    }
}
