import spock.lang.Specification

class SolutionTest extends Specification {
    def "test"() {
        setup:
        def solution = new Solution()
        def s = 'AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT'
        def expect = ['AAAAACCCCC', 'CCCCCAAAAA']

        when:
        def result = solution.findRepeatedDnaSequences(s)

        then:
        result == expect
    }
}
