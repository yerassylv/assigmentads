//This method prints the reverse order of the elements in an array.
// Time complexity is O(n).
//In base case when iter reacher 0, it returns.
// In recursive case when iter is greater than 0, it calls itself with iter - 1 til it reachs base case.

import java.util.Scanner;

public class Problem7 {

    public static void reverse(Scanner scanner, int i) {
        if (i == 0) return;
        int a = scanner.nextInt();
        reverse(scanner, i - 1);
        System.out.print(a + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        System.out.println("Enter the elements: ");
        int i = scanner.nextInt();
        reverse(scanner, i);
        double start = System.nanoTime();
        double end = System.nanoTime();
        double duration = (end - start) / 1000000;
        System.out.println("");
        System.out.println("Time taken: " + duration + " ms");
    }
}
