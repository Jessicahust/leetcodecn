package com.netease.work.mock.leetcode;

import java.util.Stack;

/**
 * description:
 * Date: 2019-09-15 下午11:04<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class ParenthesesIsValid {

    public static void main(String[] args) {
        System.out.println(new ParenthesesIsValid().isValid("()[]{})"));
    }

    public boolean isValid(String s) {
        if (s == null || "".equals(s)) {
            return true;
        }
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            String s1 = s.charAt(i) + "";
            if ("(".equals(s1) || "[".equals(s1) || "{".equals(s1)) {
                stack.push(s1);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                String pop = stack.pop();
                if (pop.equals("(") && !s1.equals(")") || pop.equals("[") && !s1.equals("]") || pop.equals("{") && !s1.equals("}")) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
