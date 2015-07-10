import spock.lang.Specification

class SolutionTest extends Specification {
    def "test"() {
        setup:
        def solution = new Solution()
        def node1 = new ListNode(1)
        def node2 = new ListNode(2)
        def node3 = new ListNode(3)
        def node4 = new ListNode(2)
        def node5 = new ListNode(1)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5

        when:
        def result = solution.isPalindrome(node1)

        then:
        result
    }
    def "test2"() {
        setup:
        def solution = new Solution()
        def node1 = new ListNode(1)
        def node2 = new ListNode(2)
        def node3 = new ListNode(2)
        def node4 = new ListNode(1)

        node1.next = node2
        node2.next = node3
        node3.next = node4

        when:
        def result = solution.isPalindrome(node1)

        then:
        result
    }
}
