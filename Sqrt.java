public class Sqrt {
    public static int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }

        int low = 0;
        int high = x/2 + 1;

        while(low<=high){
            int mid = low + (high-low)/2;
            long midsquare = (long) mid*mid;

            if(midsquare == x){
                return mid;
            }else if(midsquare < x){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return high;


        /* LINEAR SEARCH

        int i;
        if(x == 1){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        for(i = 1; i <= x / 2; i++) {
            if((long) i * i > x) {
                return i - 1;
            }
            if((long) i * i == x) {
                return i;
            }
        }
        return i - 1;

         */
    }

    public static void main(String[] args) {
        int x = 2147483647;
        System.out.println(mySqrt(x)); // Expected output: 46340
    }
}
