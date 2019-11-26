package com.netease.work.mock.leetcode.zifuchuan;

import java.util.Stack;

/**
 * description:
 * Date: 2019-10-20 下午5:48<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class BackspaceCompare {

    public boolean backspaceCompare(String S, String T) {
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        for (int i = 0; i < S.length(); ++i) {
            String s = S.charAt(i) + "";
            if (!"#".equals(s)) {
                stack1.push(s);
            } else {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            }
        }

        for (int j = 0; j < T.length(); ++j) {
            String t = T.charAt(j) + "";
            if (!"#".equals(t)) {
                stack2.push(t);
            } else {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            }
        }
        StringBuilder s1 = new StringBuilder();
        while (!stack1.isEmpty()) {
            String pop = stack1.pop();
            s1.append(pop);
        }
        StringBuilder s2 = new StringBuilder();
        while (!stack2.isEmpty()) {
            String pop = stack2.pop();
            s2.append(pop);
        }
        if (s1.toString().equals(s2.toString())) {
            return true;
        }
        return false;
    }
}
