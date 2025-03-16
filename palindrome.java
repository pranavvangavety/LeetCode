public class palindrome {
    public static void main(String[] args){
       int x = 121;
       boolean result = ispalindrome(x);
       System.out.println(result);

    }

    public static boolean ispalindrome(int x){
        int reversed = 0;
        int original = x;

        while(original > 0){
            int digit = original%10;
            reversed = reversed * 10 + digit;
            original = original/10;
        }
        return x == reversed;
    }

}

