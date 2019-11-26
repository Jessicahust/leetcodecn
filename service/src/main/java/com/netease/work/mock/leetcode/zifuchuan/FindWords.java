package com.netease.work.mock.leetcode.zifuchuan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * description:
 * Date: 2019-10-19 下午5:11<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class FindWords {

    public String[] findWords(String[] words) {
        String[] str = new String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};

        List<String> result = new ArrayList<>();
        for (String word : words){
            Set<Integer> indexSet = new HashSet<>();
            for (int i = 0;i<word.length();++i){
                char c = word.charAt(i);
                for (int j = 0; j<str.length;++j){
                    if (str[j].indexOf(c)!=-1){
                        indexSet.add(j);
                        if (indexSet.size()>1){
                            break;
                        }
                    }
                }
                if (indexSet.size()>1){
                    break;
                }
            }
            if (indexSet.size() == 1){
                result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
