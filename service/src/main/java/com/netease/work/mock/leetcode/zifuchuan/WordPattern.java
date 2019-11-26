package com.netease.work.mock.leetcode.zifuchuan;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 * Date: 2019-10-02 下午3:51<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        if (pattern.length() != s.length){
            return false;
        }
        Map<String,String> map1 = new HashMap();
        Map<String,String> map2 = new HashMap<>();
        for (int i =0;i<pattern.length();++i){
            String s1 = pattern.charAt(i)+"";
            String s2 = s[i];
            if (!map1.containsKey(s1) && !map2.containsKey(s2)){
                map1.put(s1,s2);
                map2.put(s2,s1);
            }else if (map1.containsKey(s1) && !map2.containsKey(s2)){
                return false;
            }else if (!map1.containsKey(s1) && map2.containsKey(s2)){
                return false;
            }else {
                String s3 = map1.get(s1);
                String s4 = map2.get(s2);
                if (!s1.equals(s4) || !s2.equals(s3)){
                    return false;
                }
            }
        }
        return true;
    }
}
