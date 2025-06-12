package BitManipulation;

/* Google ka question ha */

public class countSetBitsinNum {
    public static void main(String[] args) {
        
    } 
    public static int countBit(int n){
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }

}
