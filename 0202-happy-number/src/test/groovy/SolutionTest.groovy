import spock.lang.Specification

class SolutionTest extends Specification {
    def "test"() {
        setup:
        def solution = new Solution()

        when:
        def result = solution.isHappy(input)

        then:
        expect == result

        where:
        input || expect
        1      | true
        19     | true
        0      | false
    }
}
