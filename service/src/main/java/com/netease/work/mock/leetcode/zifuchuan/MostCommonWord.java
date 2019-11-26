package com.netease.work.mock.leetcode.zifuchuan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description:
 * Date: 2019-11-23 下午9:42<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MostCommonWord {

    public static void main(String[] args) {
        System.out.println(new MostCommonWord().mostCommonWord("Bob. hIt, baLl",new String[]{"bob", "hit"}));
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.replace(',', ' ').replace('.', ' ').replace('!', ' ').replace('?', ' ')
                .replace(';', ' ').replace('\'', ' ').toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();
        List<String> list = Arrays.asList(banned);
        for (int i = 0; i < words.length; ++i) {
            if (words[i].equals("")){
                continue;
            }
            if (list.contains(words[i])) {
                continue;
            }
            Integer integer = map.get(words[i]);
            if (integer == null) {
                map.put(words[i], 1);
            } else {
                map.put(words[i], integer + 1);
            }
        }
        int count = 0;
        String ret = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                ret = entry.getKey();
            }
        }
        return ret;
    }
}
