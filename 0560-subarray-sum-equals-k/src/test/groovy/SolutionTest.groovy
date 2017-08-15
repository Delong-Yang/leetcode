import spock.lang.Specification

class SolutionTest extends Specification {
    def "test"() {
        setup:
        def solution = new Solution()
        int[] num = new int[3]
        num[0]=1
        num[1]=1
        num[2]=1

        when:
        int k = solution.subarraySum(num, 2)
        then:
        k == 2
    }
}
