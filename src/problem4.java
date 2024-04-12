// This method finds the factorial of a number. It uses recursion.
// Here if the number is 1 or less than 1, it returns 1. It is base case.
// Then it recursively calls itself with the argument n -1  and multiplies the result by n.
//It means that algorithm iterates from n to 1 till it reaches 1.(base case)
import java.util.Scanner;
public class problem4 {
    public static int factorial(int n) {
        if(n <=1)
            return 1;
        return factorial(n-1)*n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int res = factorial(n);
        System.out.println(res);
        double start = System.nanoTime();
        double end = System.nanoTime();
        double duration = (end - start) / 1000000;
        System.out.println("Time taken: " + duration + " ms");
    }



}
