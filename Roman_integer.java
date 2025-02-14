import java.util.HashMap;
import java.util.Map;

public class Roman_integer {
    public static void main(String[] args) {
        String s = "IX";

        //hashmap
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;

        for(int i = 0;i < s.length(); i++){
            char current = s.charAt(i);
            int value = romanMap.get(current);
            if(i+1 < s.length() && value < romanMap.get(s.charAt(i+1))){
                result -= value;
            }else{
                result += value;
            }
        }

        System.out.println(result);
    }
}
