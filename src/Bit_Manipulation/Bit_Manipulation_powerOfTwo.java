package Bit_Manipulation;
public class Bit_Manipulation_powerOfTwo {

    public static boolean powerOfTwo(int num){
        if((num & num-1) == 0){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        int num = 13;
        System.out.println(powerOfTwo(num));

    }
    
}
