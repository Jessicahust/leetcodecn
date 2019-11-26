package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-26 下午5:58<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsLongPressedName {

    public static void main(String[] args) {
        System.out.println(new IsLongPressedName().isLongPressedName("allex", "aalex"));
    }

    public boolean isLongPressedName(String name, String typed) {
        if (name.length() == 0 || typed.length() == 0){
            return false;
        }
        char prefix = name.charAt(0);
        int i = 0;
        int j = 0;
        while (i < name.length() || j < typed.length()) {
            if (i < name.length() && j < typed.length() && (typed.charAt(j) == name.charAt(i))) {
                prefix = name.charAt(i);
                ++i;
                ++j;
                continue;
            } else if (j < typed.length() && typed.charAt(j) == prefix) {
                ++j;
            } else {
                return false;
            }
        }
        return true;
    }
}
