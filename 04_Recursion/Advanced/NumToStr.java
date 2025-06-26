package Recursion.Questions;

public class NumToStr {
    public static void main(String[] args) {
        printDigits(1234);
    }
    public static void printDigits(int no){
        String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"} ;
        if (no == 0) {
            return;
        }
        int last = no%10;
        printDigits(no/10);
        System.out.println(digits[last]+ " ");
    }
}
