package com.netease.work.mock.leetcode.zifuchuan;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Date: 2019-10-24 下午10:54<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class LetterCasePermutation {

    public static void main(String[] args) {
        System.out.println(new LetterCasePermutation().letterCasePermutation("11"));
    }
    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        result.add(S);
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) >= '0' && S.charAt(i) <= '9') {
                continue;
            }
            List<String> tmp = new ArrayList<>();
            for (int j = 0; j < result.size(); ++j) {
                String s = result.get(j);
                tmp.add(s);
                char[] charArray = s.toCharArray();
                if (charArray[i] >= 65 && charArray[i] <= 90) {
                    charArray[i] = (char) (charArray[i] + 32);
                } else {
                    charArray[i] = (char) (charArray[i] - 32);
                }
                String s1 = new String(charArray);
                tmp.add(s1);
            }
            result = tmp;
        }

        return result;
    }

}
