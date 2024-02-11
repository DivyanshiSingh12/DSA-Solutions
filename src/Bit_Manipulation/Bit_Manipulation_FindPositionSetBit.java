package Bit_Manipulation;
public class Bit_Manipulation_FindPositionSetBit {

    public static int setBitIndex(int N){
        int n = N;
        int count = 0;
         if(N==0){
             return -1;
         }
         
         while(n>0){
             if((n&1) != 0){
                 count++;
             }
             n=n>>1;
             
         }
         if(count>1){
             return -1;
         }
        
        int i=0;

        while(N>0){
            if((N&1) != 0){
                break;
            }
            i++;
            N = N>>1;
        }

        return i+1;
    }

    public static void main(String args[]){
        int num = 8;
        System.out.println(setBitIndex(num));

    }
    
}
