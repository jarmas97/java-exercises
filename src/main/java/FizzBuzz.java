
// List numbers from 1 to 100,
// if a number is divisible by 3, then print Fizz, if divisible by 5,
// then Buzz, if divisible by 3, and 5, print FizzBuzz.
// Otherwise, print a number.

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
