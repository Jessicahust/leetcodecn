package com.netease.work.mock.leetcode;

import java.util.Stack;

/**
 * description:
 * Date: 2019-09-30 下午9:37<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MyQueue {
    private Stack<Integer> inStack;

    private Stack<Integer> outStack;

    /** Initialize your data structure here. */
    public MyQueue() {

        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (inStack.isEmpty() && outStack.isEmpty()){
            return -1;
        }
        if (!outStack.isEmpty()){
            return outStack.pop();
        }
        while (!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
        return outStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (inStack.isEmpty() && outStack.isEmpty()){
            return -1;
        }
        if (!outStack.isEmpty()){
            return outStack.peek();
        }
        while (!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
        return outStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}
