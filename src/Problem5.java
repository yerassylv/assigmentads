//This method calculates the nth fibonacci number with using recursion.
//The base case is when n is 0 or 1, where the method returns n.
// The recursive case is when n is greater than 1, where the method calls itself with n - 1 and n - 2.
// The time complexity of this code is O(n), where n is the input number
import java.util.Scanner;

public class Problem5 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        double start = System.nanoTime();
        int result = fibonacci(n);
        double end = System.nanoTime();
        double duration = (end - start) / 1000000;
        System.out.println("Time taken: " + duration + " ms");
        System.out.println(result);
    }
}
