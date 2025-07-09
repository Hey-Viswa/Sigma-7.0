import java.util.Stack;

public class DuplicateParenthesis {
    // google , microsoft
    public static void main(String[] args) {
        String str1 = "((a+b))"; // true
        String str2 = "(a+(b)/c)"; // false
        String str3 = "(a+b*(c-d))"; // false

        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
        System.out.println(isDuplicate(str3));
    }

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (!s.isEmpty()) s.pop(); // pop the opening '('
                if (count < 1) {
                    return true;
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }
}
