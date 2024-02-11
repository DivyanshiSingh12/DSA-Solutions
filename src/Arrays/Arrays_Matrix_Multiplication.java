package Arrays;
import java.util.*;
public class Arrays_Matrix_Multiplication {

    public static void Matrix_Multiply(int a[][], int b[][]){

        if(a[0].length==b.length){

            int c[][] = new int[a.length][b[0].length];
            for(int i=0;i<c.length;i++){
                for(int j=0;j<c[0].length;j++){
                    c[i][j] = 0;
                }
            }

            for(int i=0; i<c.length; i++){
                for(int j=0;j<c[0].length;j++){
                     for(int k=0; k<a[0].length;k++){
                        int sum = a[i][k]*b[k][j];
                        c[i][j] = c[i][j]+sum;
                     }
                }
            }

           for(int i=0;i<c.length;i++){
                for(int j=0;j<c[0].length;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
            

        }else{
            System.out.print("No Multiplication possible");
        }

    }

    public static void main(String args[]){

        int n,m;
        int p,q;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows of the first matrix");
        n = input.nextInt();
        System.out.println("Enter number of columns of the first matrix");
        m = input.nextInt();
        System.out.println("Enter number of rows of the Second matrix");
        p = input.nextInt();
        System.out.println("Enter number of columns of the Second matrix");
        q = input.nextInt();




        int a[][] = new int[n][m];
        int b[][] = new int[p][q];

        for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    a[i][j] = input.nextInt();
                }
                
        }
        System.out.println("The First Matrix");
        for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
                
        }

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                b[i][j] = input.nextInt();
            }
                
        }
                
        System.out.println("The Second Matrix");
        for(int i=0;i<b.length;i++){
                for(int j=0;j<b[0].length;j++){
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
                
        }



        Matrix_Multiply(a,b);

        
    }
    
}
