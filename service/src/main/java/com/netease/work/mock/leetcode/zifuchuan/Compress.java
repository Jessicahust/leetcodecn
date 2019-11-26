package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-27 下午5:03<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class Compress {
    public static void main(String[] args) {
        System.out.println(new Compress().compress(new char[]{'a','a','b','b','c','c','c'}));
    }

    public int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }
        int count = 1;
        char pre = chars[0];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == pre) {
                ++count;
            } else {
                int index = stringBuilder.length();
                if (count == 1) {
                    chars[index] = pre;
                    stringBuilder.append(pre);
                } else {
                    chars[index++] = pre;
                    char[] toCharArray = (count + "").toCharArray();
                    for (int j = 0;j<toCharArray.length;++j) {
                        chars[index++] = toCharArray[j];
                    }
                    stringBuilder.append(pre).append(count);
                }
                pre = chars[i];
                count = 1;
            }
        }
        int index = stringBuilder.length();
        if (count == 1){
            chars[index++] = pre;
            stringBuilder.append(pre);
        }else {
            chars[index++] = pre;
            char[] toCharArray = (count + "").toCharArray();
            for (int j = 0;j<toCharArray.length;++j) {
                chars[index++] = toCharArray[j];
            }
            stringBuilder.append(pre).append(count);
        }
        return stringBuilder.toString().length();
    }
}
