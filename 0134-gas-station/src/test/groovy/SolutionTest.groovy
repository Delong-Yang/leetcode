import spock.lang.Specification

class SolutionTest extends Specification {
    def "test"() {
        setup:
        def solution = new Solution()
        int[] gas = [1, 2, 3, 4, 5]
        int[] cost = [2, 1, 2, 5, 5]
        def expect = 1

        when:
        def result = solution.canCompleteCircuit(gas, cost)

        then:
        result == expect

    }
}
