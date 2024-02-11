package Backtracking;
public class Grid_Ways {

    public static int findGridWays(int i,int j,int n, int m){
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }
        //down
        int w1 = findGridWays(i, j+1, n, m);
        //right
        int w2 = findGridWays(i+1, j, n, m);

        return w1+w2;
    }

    public static void main(String args[]){
        System.out.println(findGridWays(0, 0, 3, 3));

    }
    
}
