package BitManipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        
    }
    public static boolean isPower(int n){
        return (n&(n-1)) == 0;
        
    }
}
