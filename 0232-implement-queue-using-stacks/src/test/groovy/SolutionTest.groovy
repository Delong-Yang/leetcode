import spock.lang.Specification

class SolutionTest extends Specification {
    def "test"() {
        setup:
        def queue = new MyQueue()

        when:
        queue.push(1)
        queue.push(2)

        then:
        1 == queue.peek()

        when:
        queue.pop()

        then:
        2 == queue.peek()

        when:
        queue.pop()

        then:
        queue.empty()
    }
}
