/**
 * Created by Delong on 15-6-26.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode pre = head;
        ListNode cur = pre;
        head.next = l1 == null ? l2 : l1;
        boolean carry = false;
        while (l1 != null || l2 != null) {
            int val = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + (carry ? 1 : 0);
            carry = val > 9;
            val %= 10;
            cur = l1 == null ? l2 : l1;
            cur.val = val;

            pre.next = cur;
            pre = cur;
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
        }
        if (carry) {
            ListNode tail = new ListNode(1);
            pre.next = tail;
        }
        return head.next;
    }
}
