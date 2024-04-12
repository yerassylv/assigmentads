//This method finds the binomial coefficient of two numbers.
// Time complexity of the algorithm is O(2^n).
//In the recursive case: we call the method with n-1 and k-1.
//In the base case: if k=0 or n=k, we return 1.

import java.util.Scanner;


public class Problem9 {
    public static long binomCoef(int n, int k)
    {
        if (k==n || k==0)
            return 1;
        else return binomCoef(n-1,k-1) + binomCoef(n-1, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and k: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binomCoef(n ,k));
        double start = System.nanoTime();
        double end = System.nanoTime();
        double duration = (end - start) / 1000000;
        System.out.println("Time taken: " + duration + " ms");
    }
}