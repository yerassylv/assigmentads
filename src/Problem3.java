//This method checks whether a number is prime or not with using recursion.
//The time complexity of this algorithm is O(sqrt(n)), where n is the input number
//The base case in this code is when n is equal or less than 2. The method returns true.
//It iterates over potential divisors up to the square root of the number, efficently detemrining if the number is prime or not.

import java.util.Scanner;

public class Problem3{
    public static boolean PrimeCheck(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return PrimeCheck(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        if (PrimeCheck(n, 2)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
