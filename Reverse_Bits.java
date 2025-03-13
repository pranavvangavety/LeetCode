public class Reverse_Bits {
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 0b00000010100101000001111010011100;
        int reversed = reverseBits(n);

        System.out.println("Original: " + Integer.toBinaryString(n));
        System.out.println("Reversed: " + Integer.toBinaryString(reversed));
        System.out.println("Reversed (Decimal): " + reversed);
    }
}
