//This method checks if a string contains only digits.
// Time complexity is O(n).
// In the base case: if index is equal to the length of the string, it returns true.
//In the recursion: it checks if the character at index is a digit. If it is, it calls itself with index + 1. If it is not, it returns false.
public class Problem8 {
    public static boolean CheckDigits(String s, int index) {
            if (index == s.length()) {
                return true;
            }

            char currentChar = s.charAt(index);
            if (Character.isDigit(currentChar)) {
                return CheckDigits(s, index + 1);
            } else {

                return false;
            }
        }

        public static void main(String[] args) {
            String s1 = "123456";
            String s2 = "123a12";
            System.out.println("s1 has only digits: " + CheckDigits(s1, 0));
            System.out.println("s2 has only digits: " + CheckDigits(s2, 0));
            double start = System.nanoTime();
            double end = System.nanoTime();
            double duration = (end - start) / 1000000;
            System.out.println("Time taken: " + duration + " ms");
        }
    }




