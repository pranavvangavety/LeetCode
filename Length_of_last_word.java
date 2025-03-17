public class Length_of_last_word {

    public static int lengthOfLastWord(String s){
        int count = 0;
        s = s.trim();

        for(int i = s.length() - 1;i>=0;i--){
            if(s.charAt(i) != ' '){
                count++;
            }else{ //(count>0) required if we're not trimming trailing whitespace
                break;
            }
        }
        return count;

    }

    public static void main(String[] args){
        String s = "Hello World ";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }
}
