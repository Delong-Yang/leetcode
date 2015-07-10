import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    Stack<ListNode> stack = new Stack<>();
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode p = head;
        while (p != null) {
            stack.push(p);
            p = p.next;
        }

        p = head;

        while (p != null) {
            if (p.val != stack.pop().val) {
                return false;
            }
            p = p.next;
        }
        return true;
    }
}