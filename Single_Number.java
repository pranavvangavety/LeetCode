public class Single_Number {

    public static int singleNumber(int[] nums) {
        int result = 0; // Initialize result to 0

        for (int num : nums) {
            result ^= num; // XOR each number
        }

        return result; // The single number remains
    }

    public static void main(String[] args){
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }
}
