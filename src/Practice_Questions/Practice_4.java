package Practice_Questions;
import java.util.*;
//Sudoku Solver
import java.util.*;
public class Practice_4 {

   public static class Queue{
    int arr[];
    int size;
    int rear;

    public Queue(int n){
      arr = new int[n];
      size = n;
      rear = -1;
    }

    //isEmpty
    public boolean isEmpty(){

      return rear == -1;
    }
    //isFull
    public boolean isFull(){

      return rear == size-1;
    }

    //Adding in a Queue (Enqueue)
    public void add(int data){
      if(isFull()){
        System.out.println("Queue is Full");

      }
      rear = rear + 1;
      arr[rear] = data;
    }

    //Removing from a Queue (dqueue)
    public void deQueue(){
      if(isEmpty()){
        System.out.println("Queue is Full");

      }
      int temp = arr[0];
      for(int i=1;i<size;i++){
        arr[i-1] = arr[i];
      }
      rear = rear - 1;

    }

    //Peek
    public int Peek(){
      if(isEmpty()){
        System.out.println("Queue is Empty");
      }

      return arr[0];
    }

   }

    
    public static void main(String args[]){
      Queue q = new Queue(5);
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.deQueue();
      q.add(5);
      q.add(6);

      for(int i=0;i<5;i++){
        System.out.print(q.Peek()+" ");
        q.deQueue();
      }



    } 

   
    
}
