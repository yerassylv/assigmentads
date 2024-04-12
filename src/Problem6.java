//This method calculates the power of a number using recursion.
//The base case is when b is 0, where the method returns 1.
//The recursion case is when b is greater than 0, where the method calls itself with a and b - 1 untill b becomes 0.
//Time complexity of this code is O(b), where b is the exponent.


import java.util.Scanner;

public class Problem6 {
    public static double PowerCalc(int a,int b){
        if(b == 0){
            return 1;
        }
        return a * PowerCalc(a,b-1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        double res = PowerCalc(a,b);
        System.out.println(res);
        double start = System.nanoTime();
        double end = System.nanoTime();
        double duration = (end - start) / 1000000;
        System.out.println("Time taken: " + duration + " ms");


    }
}
