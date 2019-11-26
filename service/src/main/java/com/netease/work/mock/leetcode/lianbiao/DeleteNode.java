package com.netease.work.mock.leetcode.lianbiao;

/**
 * description:
 * Date: 2019-09-24 下午9:35<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class DeleteNode {
    public static void main(String[] args) {
        new DeleteNode().deleteNode(new ListNode(1));
    }

    public void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}
