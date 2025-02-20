public class Length_of_last_word {

    public static int lengthOfLastWord(String s){
        int count = 0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                count++;
            } else if (count > 0) { //(count>0) not required if we're trimming
                break;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String s = "Hello World ";
//        s = s.trim(); // Not required since we're using count>0
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }
}
