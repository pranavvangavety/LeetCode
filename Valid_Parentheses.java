import java.util.HashMap;
import java.util.Stack;

public class Valid_Parentheses {

    public static boolean ifValidParentheses(String s) {

        HashMap<Character, Character> parentheses = new HashMap<>();
        parentheses.put('(', ')');
        parentheses.put('[', ']');
        parentheses.put('{', '}');

        // String to Character Array
        char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char i : chars) {
            if (parentheses.containsKey(i)) {
                stack.push(i);
            } else if (parentheses.containsValue(i)) {
                if (stack.isEmpty() || parentheses.get(stack.pop()) != i) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args){
        String s = "([]";
        System.out.println(ifValidParentheses(s));
    }

}

