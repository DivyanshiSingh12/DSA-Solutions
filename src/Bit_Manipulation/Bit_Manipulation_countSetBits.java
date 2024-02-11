package Bit_Manipulation;
public class Bit_Manipulation_countSetBits {

    public static void main(String args[]){
        int num = 7;
        int count = 0;

        while(num>0){
            if((num&1) != 0){
                count++;
            }
            num = num>>1;
        }

        System.out.println(count);
    }
    
}
