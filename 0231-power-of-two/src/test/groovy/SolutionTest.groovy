import spock.lang.Specification

class SolutionTest extends Specification {
    def "test"() {
        setup:
        def solution = new Solution()

        when:
        def result = solution.isPowerOfTwo(input)

        then:
        expect == result

        where:
        input     || expect
        0          | false
        1073741825 | false
    }
}
