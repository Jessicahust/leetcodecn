package com.netease.work.mock.leetcode;

import java.util.Stack;

/**
 * description: 155. 最小栈
 * Date: 2019-09-20 下午9:02<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MinStack {

    private Stack<Integer> stack;

    private Stack<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (minStack.isEmpty()) {
            minStack.push(x);
        } else {
            Integer peek = minStack.peek();
            if (x <= peek) {
                minStack.push(x);
            }
        }
        stack.push(x);
    }

    public void pop() {
        if (!stack.isEmpty()){
            Integer pop = stack.pop();
            if (!minStack.isEmpty()){
                if (minStack.peek().equals(pop)){
                    minStack.pop();
                }
            }
        }
    }

    public int top() {
        if (!stack.isEmpty()){
            return stack.peek();
        }
        return 0;
    }

    public int getMin() {
        if (!minStack.isEmpty()){
            return minStack.peek();
        }
        return 0;
    }
}
