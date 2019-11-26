package com.netease.work.mock.leetcode.lianbiao;

/**
 * description: 203. 移除链表元素
 * Date: 2019-09-29 下午11:07<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class RemoveElements {
    public static void main(String[] args) {
        new RemoveElements().removeElements(new ListNode(1), 6);
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        ListNode pre = head;
        ListNode q = null;
        while (p != null) {
            if (p == head && p.val == val) {
                q = p;
                p = p.next;
                head = head.next;
                q.next = null;
                q = null;
                continue;
            }
            if (p.val == val) {
                pre.next = p.next;
                q = p;
                q.next = null;
                q = null;
                p = pre.next;
            } else {
                pre = p;
                p = p.next;
            }
        }
        return head;
    }
}
