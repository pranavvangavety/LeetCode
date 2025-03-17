public class Remove_duplicates {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1;j<nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3}; // Input array

        int k = removeDuplicates(nums); // Calls your implementation
        System.out.println(k);
    }
}
