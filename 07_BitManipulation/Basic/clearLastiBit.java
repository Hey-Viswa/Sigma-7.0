package BitManipulation;

class clearLastiBit {
    public static void main(String[] args) {
        System.out.println(clearIBits(15,2));
    }
    public static int clearIBits(int n , int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static int clearIRangeBits(int n , int i, int j){
      int a = ((~0)<<(j+1));
      int b = (1 << i)-1;  
      int bitmask = a | b;
      return n & bitmask;
    }
    
    
}