import spock.lang.Specification

class SolutionTest extends Specification {
    def "longest substring of abcabcbb is abc"() {
        setup:
        def solution = new Solution()
        def input = 'abcabcbb'
        def expect = 3

        when:
        def actual = solution.lengthOfLongestSubstring(input)
        then:
        expect == actual
    }
}
