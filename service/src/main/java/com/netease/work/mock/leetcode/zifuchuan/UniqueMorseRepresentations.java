package com.netease.work.mock.leetcode.zifuchuan;

import java.util.HashSet;
import java.util.Set;

/**
 * description:
 * Date: 2019-10-13 下午2:20<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class UniqueMorseRepresentations {

    public int uniqueMorseRepresentations(String[] words) {
        String[] str = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; ++i) {
            StringBuilder stringBuilder = new StringBuilder();
            String value = words[i];
            for (int j = 0; j < value.length(); ++j) {
                int index = value.charAt(j) - 'a';
                stringBuilder.append(str[index]);
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }
}
