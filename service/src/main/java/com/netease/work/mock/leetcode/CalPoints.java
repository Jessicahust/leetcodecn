package com.netease.work.mock.leetcode;

import java.util.Stack;

/**
 * description:
 * Date: 2019-10-26 下午5:38<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class CalPoints {
    public static void main(String[] args) {
        System.out.println(new CalPoints().calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; ++i) {
            if (ops[i].equals("+")) {
                if (stack.isEmpty()){
                    continue;
                }
                int first = 0;
                int second = 0;
                if (stack.size() >= 2) {
                    first = stack.pop();
                    second = stack.peek();
                    stack.push(first);
                    stack.push(first + second);
                }else {
                   stack.push(stack.peek());
                }
            } else if (ops[i].equals("D")) {
                if (!stack.isEmpty()) {
                    stack.push(stack.peek() * 2);
                }
            } else if (ops[i].equals("C")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }else {
                stack.push(Integer.valueOf(ops[i]));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}
