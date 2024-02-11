package Greedy_Algorithms;
import java.util.*;
public class Greedy_Algorithms_max_act {

    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int maxAct = 0;
        ArrayList<Integer> l = new ArrayList<>();

        l.add(0);
        maxAct = 1;
        int Last_idx = end[0];

        for(int i=1;i<end.length;i++){

            if(start[i]>=Last_idx){
                l.add(i);
                maxAct++;
                Last_idx = end[i];
            }
        }

        System.out.println("Maximum number of activities performed are"+maxAct);
        for(int i=0;i<l.size();i++){
            System.out.println("A"+l.get(i)+" ");
        }




    }
    
    
}
