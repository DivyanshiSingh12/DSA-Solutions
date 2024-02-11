package Dynamic_Programming;
public class DP_Fibbonacci{

    public static int fibbo(int n, int fib[]){
        if(n==0||n==1){
            return n;
        }
        if(fib[n]!=0){
            return fib[n];
        }
        fib[n] = fibbo(n-1,fib) + fibbo(n-2,fib);
        return fib[n];
    }

    public static void main(String args[]){
        int n=5;
        int fibbo[] = new int[n+1];

        System.out.println(fibbo(n, fibbo));


    }
}