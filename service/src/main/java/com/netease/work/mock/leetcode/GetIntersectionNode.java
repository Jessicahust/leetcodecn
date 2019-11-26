package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-20 下午9:24<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class GetIntersectionNode {

    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int lenA = 0;
        int lenB = 0;
        ListNode p = headA;
        ListNode q = headB;
        while (p != null) {
            ++lenA;
            p = p.next;
        }
        while (q != null) {
            ++lenB;
            q = q.next;
        }
        int interval = Math.abs(lenA - lenB);
        p = headA;
        q = headB;
        while (p != null && q != null) {
            if (interval != 0 && lenA < lenB) {
                q = q.next;
                --interval;
            } else if (interval != 0 && lenA > lenB) {
                p = p.next;
                --interval;
            } else {
                if (p == q) {
                    return p;
                }
                p = p.next;
                q = q.next;
            }
        }
        return null;
    }
}
