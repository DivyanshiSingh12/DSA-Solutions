package Stacks;
public class Stack_TwoStackinArray{

    public static class TwoStacks{
        int arr[];
        int size;
        int top1, top2;

        public TwoStacks(int n){
            arr = new int[n];
            size = n;
            top1 = -1;
            top2 = -1;
        }

        public boolean isEmpty1(){
            return top1 == -1;
        }

        public boolean isEmpty2(){
            return top2 == -1;
        }

        public boolean isFull1(){
            return top1 == (size/2)-1;
        }

        public boolean isFull2(){
            return top2 == size - 1;
        }

        //push1
        public void push1(int data){
            if(isFull1()){
               System.out.println("Stack 1 is full");
            }

            top1 = top1 + 1;
            arr[top1] = data; 
        }
        //push2
        public void push2(int data){
            if(isFull2()){
               System.out.println("Stack 2 is full");
            }
            
            if(top2==-1){
                top2 = size/2;
                arr[top2] = data;
            }else{
                top2 = top2 + 1;
                arr[top2] = data;
            }
        }

        //pop1
        public int pop1(){
            if(isEmpty1()){
                System.out.println("Stack is Empty");
            }
            int temp = arr[top1];
            arr[top1] = 0;
            top1 = top1 - 1;
            return temp;
        }
        //pop2
        public int pop2(){
            if(isEmpty2()){
                System.out.println("Stack is Empty");
            }
            int temp = arr[top2];
            arr[top2] = 0;
            top2 = top2 - 1;
            return temp;
        }

        //peek1
        public int peek1(){
            if(isEmpty1()){
                return -1;
            }
            return arr[top1];
        }

        public int peek2(){
            if(isEmpty2()){
                return -1;
            }
            return arr[top2];
        }

        public void printArray(){
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String args[]){
        TwoStacks s = new TwoStacks(6);
        s.push1(1);
        s.push1(2);
        s.push2(3);
        s.push2(4);
        s.push1(5);
        s.push2(7);
        s.pop1();
        s.pop2();
        s.push2(8);
        System.out.println(s.peek1());

        s.printArray();



    }
}