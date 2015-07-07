import spock.lang.Specification

class SolutionTest extends Specification {
    def "test"() {
        setup:
        def stack = new MyStack()

        when:
        stack.push(1)
        stack.push(2)

        then:
        2 == stack.top()

        when:
        stack.pop()

        then:
        1 == stack.top()

        when:
        stack.pop()

        then:
        stack.empty()
    }

    def "test2"() {
        setup:
        def stack = new MyStack()

        when:
        stack.push(1)
        stack.push(2)

        then:
        2 == stack.top()

        when:
        stack.push(3)

        then:
        3 == stack.top()

    }

}
