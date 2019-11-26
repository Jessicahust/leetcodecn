package com.netease.work.mock.leetcode.lianbiao;

/**
 * description:
 * Date: 2019-09-20 下午8:39<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class HasCycle {

    public static void main(String[] args) {
        System.out.println(new HasCycle().hasCycle(new ListNode(1)));
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode p = head;
        ListNode q = head;
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                return true;
            }

        }
        return false;
    }
}
