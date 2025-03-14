public class Number_of_1_bits {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1); // Check if the last bit is 1
            n >>>= 1; // Unsigned right shift
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 0b00000000000000000000000000001011; // Example input (binary 11)
        Number_of_1_bits solution = new Number_of_1_bits();
        int result = Number_of_1_bits.hammingWeight(n);

        System.out.println("Number of 1 bits: " + result);
    }
}
