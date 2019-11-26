package com.netease.work.mock.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * description:
 * Date: 2019-09-30 下午8:57<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MyStack {

    private Queue<Integer> inQueue;

    private Queue<Integer> outQueue;
    /** Initialize your data structure here. */
    public MyStack() {
        inQueue = new LinkedList<>();
        outQueue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (inQueue.isEmpty() && outQueue.isEmpty()){
            inQueue.offer(x);
        }else if (inQueue.isEmpty()){
            outQueue.offer(x);
        }else if (outQueue.isEmpty()){
            inQueue.offer(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (inQueue.isEmpty() && outQueue.isEmpty()) {
            return -1;
        }
        if (inQueue.isEmpty()){
            while (outQueue.size()!=1){
                Integer poll = outQueue.poll();
                inQueue.offer(poll);
            }
            return outQueue.poll();
        }else if (outQueue.isEmpty()){
            while (inQueue.size()!=1){
                Integer poll = inQueue.poll();
                outQueue.offer(poll);
            }
            return inQueue.poll();
        }
        return -1;
    }

    /** Get the top element. */
    public int top() {
        if (inQueue.isEmpty() && outQueue.isEmpty()) {
            return -1;
        }
        if (inQueue.isEmpty()){
            while (outQueue.size()!=1){
                Integer poll = outQueue.poll();
                inQueue.offer(poll);
            }
            Integer poll = outQueue.poll();
            inQueue.offer(poll);
            return poll;
        }else if (outQueue.isEmpty()){
            while (inQueue.size()!=1){
                Integer poll = inQueue.poll();
                outQueue.offer(poll);
            }
            Integer poll = inQueue.poll();
            outQueue.offer(poll);
            return poll;
        }
        return -1;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return inQueue.isEmpty() && outQueue.isEmpty();
    }
}
