public class palindrome {
    public static void main(String[] args){
       int x = 121;
       boolean result = ispalindrome(x);
       System.out.println(result);

    }

    public static boolean ispalindrome(int x){
        int reversed = 0;
        int original = x;
        while(x>0){
            int digit = x%10;
            reversed = reversed * 10 + digit;
            x = x/10;
        }
        return reversed == original;
    }

}

