package Bit_Manipulation;
public class Bit_Manipulation_ConuntNoFlipped {

    public static int countBitsFlip(int a, int b){
        
        int count = 0;
        
        while(a>0 || b>0){
            if((a&1)!=(b&1)){
                count++;
            }
            a=a>>1;
            b=b>>1;
        }
        
        return count;
        
    }

    public static void main(String args[]){
        int n1 = 10;
        int n2 = 20;
        System.out.println(countBitsFlip(n1, n2));
    }
    
}
