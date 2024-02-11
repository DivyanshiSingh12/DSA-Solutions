package Bit_Manipulation;
public class Bit_Manipulation {

    public static int clearBitsInRangr(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask  = a| b;
        return n & bitmask;
    }

    public static boolean isPowerOfTwo(int a){
        return (a & (a-1)) == 0;
    }
    public static void main(String args[]){
        int a = 13;
        System.out.println(isPowerOfTwo(a));


    }
}
