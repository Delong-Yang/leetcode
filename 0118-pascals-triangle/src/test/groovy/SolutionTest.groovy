import spock.lang.Specification;

public class SolutionTest extends Specification {
    def "test level 5 pascals triangle" () {
        setup:
        def expect = [    [1],
                         [1,1],
                        [1,2,1],
                       [1,3,3,1],
                      [1,4,6,4,1]
                     ]

        def numRows = 5
        def solution = new Solution()

        when:
        def actual = solution.generate(numRows)

        then:
        expect == actual
        
    }

    def "test level 0"() {
        setup:
        def expect = []

        def numRows = 0
        def solution = new Solution()

        when:
        def actual = solution.generate(numRows)

        then:
        expect == actual
    }

}
