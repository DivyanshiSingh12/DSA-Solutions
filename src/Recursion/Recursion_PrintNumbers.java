package Recursion;
public class Recursion_PrintNumbers{

    public static void nt1(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.println(n);
        nt1(n-1);
    }

    public static void main(String args[]){

        nt1(10);

    }
}