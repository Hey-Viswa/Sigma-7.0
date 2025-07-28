import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String str = new String("/a/./b/../../c/");
        String res = simplify(str);
        System.out.println(res);
    }

    public static String simplify(String A) {
        Stack<String> str = new Stack<String>();
        String res = "";
        res += '/';
        int len_A = A.length();

        for (int i = 0; i < len_A; i++) {
            String dir = "";
            while (i < len_A && A.charAt(i) == '/') {
                i++;
            }
            while (i < len_A && A.charAt(i) != '/') {
                dir += A.charAt(i);
                i++;
            }
            if (dir.equals("..")) {
                if (!str.empty()) {
                    str.pop();
                }
            } else if (dir.equals(".")) {
                continue;
            } else if (dir.length() != 0) {
                str.push(dir);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append("/").append(s);
        }
        if (sb.length() == 0) {
            return "/";
        }
        return sb.toString();
    }
}
