public class Majority_Element {

    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        Majority_Element solution = new Majority_Element(); // Corrected class name
        int majorityElement = solution.majorityElement(nums);

        System.out.println("Majority Element: " + majorityElement);
    }
}
