package Recursion;
public class Recurssion_XtoN {

    public static int pow(int x, int n){

        if(n==0){
            return 1;
        }


        return x * pow(x, n-1);
    }

    public static int optimize_pow(int x, int n){

        if(n==0){
            return 1;
        }

        int ans = optimize_pow(x, n/2)*optimize_pow(x, n/2);
        if(n%2!=0){
            ans = x*ans;
        }
        return ans;
    }

    public static void main(String args[]){

        System.out.println(optimize_pow(3,3));

    }
    
}
