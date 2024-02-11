package Basics;
public class Advanced_Patterns {

    //0-1 Triangle
    public static void print01triangle(int n){

        int x = 1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x);
                if(x==1){
                    x=0;
                }else{
                    x=1;
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        print01triangle(5);
    }
    
}
