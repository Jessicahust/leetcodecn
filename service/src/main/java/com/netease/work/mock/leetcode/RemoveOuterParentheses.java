package com.netease.work.mock.leetcode;

import java.util.Stack;

/**
 * description:
 * Date: 2019-10-02 下午9:56<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class RemoveOuterParentheses {

    Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
        System.out.println(new RemoveOuterParentheses().removeOuterParentheses("(()())(())(()(()))"));
    }
    public String removeOuterParentheses(String S) {
        String res = "";
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == ')') {
                stack.pop();
            }
            if (!stack.empty()) {
                res += S.charAt(i);
            }
            if (S.charAt(i) == '(') {
                stack.push('(' + "");
            }
        }
        return res;
    }
}
