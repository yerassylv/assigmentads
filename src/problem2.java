//This method calculates the average of an array.
//If the size of the array is 0, the average is 0. It is base case.
//Otherwise, it adds the value of the nth element of the array to the result of calling calcAvg recursively with n-1
//The time complexity of this code is O(n), where n is the number of elements in the array.
public class problem2 {
    public static double calcAvg(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return (arr[n - 1] +  calcAvg(arr, n - 1));
        }
    }public static void main(String[] args) {
        int n = 4;
        int[] array = {3, 2, 4, 1};
        double average = calcAvg(array, n)/n;
        System.out.println("Average:" + average);
    }
}


