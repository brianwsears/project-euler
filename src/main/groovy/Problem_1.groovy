/*
   If we list all the natural numbers below 10 that are multiples of 3 or 5,
   we get 3, 5, 6 and 9. The sum of these multiples is 23.

   Note: Positive numbers are all Positive Integers ( Whole Numbers ) 1,2,3...etc.

   Problem: Find the sum of all the multiples of 3 or 5 below 1000.
 */

class Problem_1 {

    static void main(String[] args) {

        int answer = 0

        for(int i=0; i < 1000; i++) {
            if( Utils.isMultipleOfThree( i ) || Utils.isMultipleOfFive( i )) {
                answer += i
            }
        }

        println("ANSWER: " + answer)
    }
}
