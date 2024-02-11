package Recursion;
public class Rescursion_1toN {

    public static void onetN(int n){

        if(n==1){
            System.out.println(1);
            return;
        }
        
        onetN(n-1);
        System.out.println(n);
    }
    
    public static void main(String args[]){
        onetN(10);

    }
}
