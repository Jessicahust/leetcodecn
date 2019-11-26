package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-07 下午10:46<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(new RemoveDuplicates().removeDuplicates("abbaca"));
    }
    public String removeDuplicates(String S) {
        int i = 0;
        while (i < S.length() - 1) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                String str = S.charAt(i + 1)+""+S.charAt(i);
                String replace = S.replace(str, "");
                S = replace;
                i = 0;
            }else {
                ++i;
            }
        }
        return S;
    }
}
