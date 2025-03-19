public class Climbing_stairs {

    public static int climbStairs(int n) {
        int onestepbefore = 2;
        int twostepsbefore = 1;
        int current = 0;

        if(n==1||n==2){
            return n;
        }

        for(int i = 3;i<=n; i++){
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
