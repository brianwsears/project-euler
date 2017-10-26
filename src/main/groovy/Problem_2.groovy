/*
  Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2,
  the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, etc.

  By considering the terms in the Fibonacci sequence whose values do not exceed four million,
  find the sum of the even-valued terms.
 */
class Problem_2 {

    static void main(String[] args) {

        int term1 = 1
        int term2 = 2
        int sum = 0
        int maxValue = 4000000

        while( sum < maxValue ) {
            if( Utils.isNumberEven( term2 )) {
                sum += term2
            }
            int nextTerm = term1 + term2
            term1 = term2
            term2 = nextTerm
        }

        println("ANSWER: " + sum)
    }
}
