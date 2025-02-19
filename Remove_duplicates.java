public class Remove_duplicates {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) { // Found a new unique element
                i++;
                nums[i] = nums[j]; // Move it to the correct position
            }
        }
        return i + 1; // The new length of the unique array
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2}; // Input array

        int k = removeDuplicates(nums); // Calls your implementation
        System.out.println(k);
    }
}
