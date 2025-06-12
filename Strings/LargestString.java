package Strings;

public class LargestString {
    // In lexicographic Order
    public static void main(String[] args) {
        String fruits[] = {"apple","Mango","banana"};
        String largest = fruits[0];
        for(int i = 0; i<fruits.length; i++){
            if(largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
