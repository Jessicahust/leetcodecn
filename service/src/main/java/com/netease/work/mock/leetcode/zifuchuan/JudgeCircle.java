package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-06 下午10:42<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class JudgeCircle {

    public boolean judgeCircle(String moves) {
        int countR = 0;
        int countL = 0;
        int countU = 0;
        int countD = 0;
        for(int i =0;i<moves.length();++i){
            char charAt = moves.charAt(i);
            if (charAt == 'R'){
                ++countR;
            }else if (charAt == 'L'){
                ++countL;
            }else if (charAt == 'D'){
                ++countD;
            }else {
                ++countU;
            }
        }
        if (countD == countU && countL == countR){
            return true;
        }
        return false;
    }
}
