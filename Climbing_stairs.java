public class Climbing_stairs {

    public static int climbStairs(int n) {
        int  twostepsbefore  = 1; // First step
        int onestepbefore = 2; // Second step
        int current = 0;

        if(n == 1 || n == 2){ // base case for f(1) & f(2)
            return n;
        }
        for(int i = 3;i<=n;i++){
            current = onestepbefore + twostepsbefore;
            twostepsbefore = onestepbefore;
            onestepbefore = current;
        }
        return current;

    }
    public static void main(String[] args){
        int n = 3;
        System.out.println(climbStairs(n));
    }
}
