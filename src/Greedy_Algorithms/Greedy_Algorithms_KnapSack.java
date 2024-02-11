package Greedy_Algorithms;
import java.util.*;

public class Greedy_Algorithms_KnapSack {

    public static void main(String args[]){

        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int Wt = 50;

        //2D Array
        double ratio[][] = new double[value.length][2];
        //Adding elements
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }

        //Sorting 
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        int capacity = Wt;
        int finalVal = 0;
        
        for(int i=ratio.length-1;i>=0;i--){
             int idx = (int)ratio[i][0];
             if(capacity>=ratio[i][0]){
                finalVal += value[idx];
                capacity -= weight[idx];
             }else{

                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;

             }
        }

        System.out.println(finalVal);



    }
    
}
