package Queue;
import java.util.*;
//Time Complexity = O(n)
//Space Complexity = O(n)
public class Queue_Interleave {

    public static void Interleave(Queue<Integer> q){
        Queue<Integer> q0 = new LinkedList<>();
        int size = q.size();
        
        //adding the first half of the queue in another queue
        for(int i=0;i<size/2;i++){
            q0.add(q.remove());
        }
        while(!q0.isEmpty()){
            q.add(q0.remove());
            q.add(q.remove());
        }

    }
 
    public static void main(String args[]){
        Queue<Integer> q1 = new LinkedList<>();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);

        Interleave(q1);

        while (!q1.isEmpty()){
            System.out.print(q1.remove()+" ");
        }


    }
    
}
