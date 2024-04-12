//This method finds the greatest common divisor of two numbers with using recursion.
//Time complexity of the algorithm is O(log(min(a, b))).
//In the recursive case: we call the method with b and a % b.
//In the base case: if b is 0, we return a.




import java.util.Scanner;

public class Problem10 {
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a = sc.nextInt();
        System.out.println("enter 2nd number:");
        int b = sc.nextInt();
        System.out.println(findGCD(a, b));
        double start = System.nanoTime();
        double end = System.nanoTime();
        double duration = (end - start) / 1000000;
        System.out.println("Time taken: " + duration + " ms");
    }
}
