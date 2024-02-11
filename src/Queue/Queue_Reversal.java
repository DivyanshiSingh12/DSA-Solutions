package Queue;
import java.util.*;

public class Queue_Reversal {

    public static void reversed_Queue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        for(int i=0;i<size;i++){
            int top = q.remove();
            s.push(top);
        }

        for(int i=0;i<size;i++){
            int top2 = s.pop();
            q.add(top2);
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reversed_Queue(q);

        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
