package com.netease.work.mock.leetcode.zifuchuan;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Date: 2019-10-22 上午12:05<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class CommonChars {

    public static void main(String[] args) {
        System.out.println(new CommonChars().commonChars(new String[]{"bella","label","roller"}));
    }
    public List<String> commonChars(String[] A) {
        int[][] ints = new int[A.length][26];
        List<String> result = new ArrayList<>();
        for (int i = 0; i < A.length; ++i) {
            String str = A[i];
            for (int j = 0; j < str.length(); ++j) {
                ints[i][str.charAt(j) - 'a']++;
            }
        }
        for (int i = 0; i < 26;) {
            boolean isExist = true;
            for (int j = 0; j < A.length; ++j) {
                if (ints[j][i] > 0) {
                    ints[j][i]--;
                } else {
                    isExist = false;
                    break;
                }
            }
            if (isExist){
                char ch = (char)('a'+i);
                result.add(ch+"");
            }else {
                ++i;
            }
        }
        return result;
    }
}
