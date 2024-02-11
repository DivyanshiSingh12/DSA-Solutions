package Greedy_Algorithms;
import java.util.*;
public class Greedy_Algorithms_IndianCoins {

    public static void main(String args[]){

        Integer notes[] = {1,2,5,10,20,50,100,500,2000};


        int V = 590;

        Arrays.sort(notes, Comparator.reverseOrder());

        int T = V;
        int count = 0;

        ArrayList<Integer> l = new ArrayList<>();
        
        for(int i=0;i<notes.length;i++){
            if(notes[i]<=T){
                while(notes[i]<=T){
                count++;
                l.add(notes[i]);
                T = T - notes[i];
                }

            }
        }
        System.out.println(count);
        for(int i=0;i<l.size();i++){
        System.out.println(l.get(i));
        }

    }
    
}
