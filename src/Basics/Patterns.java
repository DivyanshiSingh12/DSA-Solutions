package Basics;
public class Patterns {

    public static void Hollow_Square(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    } 

    public static void Number_Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("\n");
        }
        
    }
    public static void main(String[] args) throws Exception {
        
        int n = 5;
        Hollow_Square(n);
        //Number_Pattern(n);

    } 
}
