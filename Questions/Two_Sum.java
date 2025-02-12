import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        // Declare input variables
        int[] nums = {2,7,11,15};
        int target = 9;

        // Call the function and store the result
        int[] answer = twoSum(nums, target);
        System.out.println(Arrays.toString(answer));

    }

    public static int[] twoSum(int[] nums, int target) {
        // Implement logic here
        int len  = nums.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}


