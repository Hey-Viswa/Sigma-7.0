package practiceQuestions;

import basic.Queue;

import java.util.LinkedList;

public class GenerateBinaryNum {
    // given a number n, The task is to generate and print all binary no
    // with decimal values from, 1 to N
    static void generatePrintBinary(int n){
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while(n > 0){
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            q.add(s1 + "0");
            q.add(s1 + "1");
            n--;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        generatePrintBinary(n);
    }
}
