public class Remove_element {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j<nums.length;j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args){
        int val = 2;
        int[] nums = {3,2,2,3};

        int k = removeElement(nums, val);
        System.out.println(k);
    }
}
