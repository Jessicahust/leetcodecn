package com.netease.work.mock.leetcode.lianbiao;

/**
 * description:
 * Date: 2019-09-21 下午11:39<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome(new ListNode(1)));
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode p = head;
        int len = 0;
        while (p != null) {
            ++len;
            p = p.next;
        }
        ListNode q = head;
        int i = 1;
        while (i < len / 2) {
            ++i;
            q = q.next;
        }
        ListNode newHead = q.next;
        q.next = null;
        p = head;
        q = p.next;
        p.next = null;
        while (q != null) {
            ListNode tmp = q;
            q = q.next;
            tmp.next = p;
            p = tmp;
        }
        if (len % 2 != 0) {
            newHead = newHead.next;
        }
        while (p != null && newHead != null) {
            if (p.val != newHead.val) {
                return false;
            }
            p = p.next;
            newHead = newHead.next;
        }
        return true;
    }
}
