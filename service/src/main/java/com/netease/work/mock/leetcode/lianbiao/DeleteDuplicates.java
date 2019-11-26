package com.netease.work.mock.leetcode.lianbiao;

/**
 * description:
 * Date: 2019-09-28 下午3:49<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class DeleteDuplicates {
    public static void main(String[] args) {
        new DeleteDuplicates().deleteDuplicates(new ListNode(1));
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preNode = head;
        ListNode p = head.next;
        while (p != null) {
            if (p.val == preNode.val) {
                preNode.next = p.next;
                p.next = null;
                p = null;
                p = preNode.next;
            } else {
                preNode = p;
                p = p.next;
            }
        }
        return head;
    }
}
