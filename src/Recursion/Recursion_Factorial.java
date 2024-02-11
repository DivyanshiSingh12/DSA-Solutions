package Recursion;
public class Recursion_Factorial {

    public static int fact(int n){

        if(n==0){
            return 1;
        }
        return n*fact(n-1);

    }

    public static int Sum(int n){

        if(n==0){
            return 0;
        }

        return n + Sum(n-1);
    }

    public static void main(String args[]){
        
        System.out.println("Factorial : "+fact(5));
        System.out.println("Sum of N number : "+Sum(10));
    }
    
}
