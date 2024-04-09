//This method find the minimum element in an array.
//If the size of the array is 1, the minimum element is the only element in the array.It is  base case.
//Then, function recusively calls itself to find the minimum element in the remaining array.
public class problem1 {
    public static int findMin(int[] array, int n) {
        if (n == 1)
            return array[0];
        int min= findMin(array, n - 1);
        return Math.min(min, array[n - 1]);
    }public static void main(String[] args) {
        int n = 5;
        int[] arr = {10, 1, 32, 3, 45};
        System.out.println("Min:" + findMin(arr, n));
    }
}
