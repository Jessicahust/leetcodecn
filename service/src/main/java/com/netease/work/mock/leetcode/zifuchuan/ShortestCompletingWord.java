package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-11-23 下午8:14<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String minRet = "";
        String lower = licensePlate.toLowerCase();
        int[] arr = new int[26];
        for (int i = 0; i < lower.length(); ++i) {
            if (lower.charAt(i) >= 'a' && lower.charAt(i) <= 'z') {
                arr[lower.charAt(i) - 'a']++;
            }
        }
        for (int i = 0; i < words.length; ++i) {
            int[] tmp = new int[26];
            for (int j = 0; j < words[i].length(); ++j) {
                tmp[words[i].charAt(j) - 'a']++;
            }
            boolean isFlag = true;
            for (int index = 0; index < 26; ++index) {
                if (arr[index]>tmp[index]){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag &&(minRet.equals("") || minRet.length()>words[i].length())){
                minRet = words[i];
            }
        }
        return minRet;
    }

}
