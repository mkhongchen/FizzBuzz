/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int value = 1;
        while (value <= 100) {

            value = doFizzBuzz(value);
        }
    }

    private static int doFizzBuzz(int value) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = value % 3 == 0;
        boolean divisibleBy5 = value % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(value);

        }

        value++;
        return value;
    }
}
