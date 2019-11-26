package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-07 下午10:31<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class DetectCapitalUse {

    public boolean detectCapitalUse(String word) {
        boolean isUp = false;
        boolean isDown = false;
        boolean isFirst = false;
        if (word.isEmpty() || word.length() == 1){
            return true;
        }
        if (word.charAt(0) >= 'A' && word.charAt(0)<= 'Z'){
            isFirst = true;
        }
        for (int i =1;i<word.length();++i){
            if (word.charAt(i) >= 'A' && word.charAt(i)<= 'Z'){
                isUp = true;
            }
            if (word.charAt(i)>='a' && word.charAt(i)<='z'){
                isDown = true;
            }
        }
        if (isFirst && isUp && isDown){
            return false;
        }
        if (!isFirst && isUp){
            return false;
        }
        return true;
    }
}
