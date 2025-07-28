import java.util.Stack;

public class DecodeAString {
    public static void main(String[] args) {
        String str = "3[a2[c]]";
        System.out.println(decodeString(str)); // Output: accaccacc
    }

    static String decodeString(String str) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String curr = "";
        int k = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(curr);
                curr = "";
                k = 0;
            } else if (ch == ']') {
                StringBuilder temp = new StringBuilder(stringStack.pop());
                int count = countStack.pop();
                for (int j = 0; j < count; j++) {
                    temp.append(curr);
                }
                curr = temp.toString();
            } else {
                curr += ch;
            }
        }
        return curr;
    }
}
