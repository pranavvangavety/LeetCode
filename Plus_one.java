import java.util.Arrays;

public class Plus_one {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + 1;
            if (digits[i] < 10) {
                return digits;  // No carry, return the result
            }
            digits[i] = 0;  // Set to 0 and continue the carry
        }

        // If all digits were 9, we need a new array
        int[] result = new int[digits.length + 1];
        result[0] = 1;  // Set the first digit to 1, rest are 0 by default
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9,9,9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));  // Print the result array
    }
}
