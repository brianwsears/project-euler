import spock.lang.Specification

class UtilsSpec extends Specification {

    Utils utils

    def setup() {
        utils = new Utils()
    }

    def 'isNumberEven will return true for even numbers'() {
        expect:
            utils.isNumberEven(2 ) == true
    }

    def 'isNumberEven will return false for odd numbers'() {
        expect:
            utils.isNumberEven(3) == false
    }

    def 'isMultipleOfThree returns true if value is a multiple of 3'() {
        expect:
            utils.isMultipleOfThree(9) == true
    }

    def 'isMultipleOfThree returns false if value is not a multiple of 3'() {
        expect:
            utils.isMultipleOfThree(7) == false
    }

    def 'isMultipleOfFive returns true if value is a multiple of 5'() {
        expect:
            utils.isMultipleOfFive(10) == true
    }

    def 'isMultipleOfFive returns false if value is not a multiple of 5'() {
        expect:
            utils.isMultipleOfFive(7) == false
    }
}
