import spock.lang.Specification

/**
 * Created by Delong on 15-6-26.
 */
class SolutionTest extends Specification {
    def "(2 -> 4 -> 3) + (5 -> 6 -> 4) = (7 -> 0 -> 8)"() {
        setup:
        def solution = new Solution()
        def l1_1 = new ListNode(2)
        def l1_2 = new ListNode(4)
        def l1_3 = new ListNode(3)
        l1_1.next = l1_2
        l1_2.next = l1_3

        def l2_1 = new ListNode(5)
        def l2_2 = new ListNode(6)
        def l2_3 = new ListNode(4)
        l2_1.next = l2_2
        l2_2.next = l2_3

        def l3_1 = new ListNode(7)
        def l3_2 = new ListNode(0)
        def l3_3 = new ListNode(8)
        l3_1.next = l3_2
        l3_2.next = l3_3


        when:
        def actual = solution.addTwoNumbers(l1_1, l2_1)

        then:
        equal(l3_1, actual)
    }
    def boolean equal(ListNode l1, ListNode l2) {
        int len1 = 0, len2 = 0;

        def p1 = l1
        while (p1 != null) {
            len1++
            p1 = p1.next
        }

        def p2 = l2
        while (p2 != null) {
            len2++
            p2 = p2.next
        }

        if (len1 != len2) return false

        p1 = l1
        p2 = l2

        while(p1 != null) {
            if (p1.val != p2.val) return false
            p1 = p1.next
            p2 = p2.next
        }

        return true
    }
}
