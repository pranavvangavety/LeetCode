import java.util.Arrays;

public class Plus_one {

    public static int[] plusOne(int[] digits) {



        for(int i = digits.length - 1; i>=0; i--){
            digits[i]++;

            if(digits[i] < 10){
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] result = new int[digits.length + 1]; // If all digits are 9
        result[0] = 1;
        return result;

    }

    public static void main(String[] args) {
        int[] digits = {9,9,9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));  // Print the result array
    }
}
