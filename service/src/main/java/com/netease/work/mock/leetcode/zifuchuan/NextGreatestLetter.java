package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-10-27 下午8:36<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class NextGreatestLetter {
    public static void main(String[] args) {
        System.out.println(new NextGreatestLetter().nextGreatestLetter(new char[]{'c','f','j'}, 'j'));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        if (letters.length == 0){
            return ' ';
        }
        for (int i = 0; i < letters.length; ++i) {
            if (target < letters[i]) {
                return letters[i];
            }
        }
        return letters[0];
    }
}
