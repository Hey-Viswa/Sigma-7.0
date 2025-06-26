package Strings.Questions;

public class LowercaseCount {
    public static void main(String[] args) {
        String input = "development and innovation";  // Sample input
        String vowels = count(input);
        System.out.println("Lowercase vowels found: " + vowels);
        System.out.println("Total lowercase vowels: " + vowels.length());
    }
    public static String count(String str){
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
