import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "({})[]";
        System.out.println("String: " + str + " is valid: " + isValid(str));
        
        String str2 = "({[})]";
        System.out.println("String: " + str2 + " is valid: " + isValid(str2));
    }

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                // closing
                if (s.isEmpty()) {
                    return false;
                }
                //pari
                if ((s.peek() == '(' && ch == ')')
                || s.peek() == '{' && ch == '}' 
                || s.peek() == '[' && ch == ']'
                ) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
