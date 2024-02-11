package Arrays;
import java.util.*;
public class ArrayList_Basics {

    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        mainList.add(l1);
        mainList.add(l2);

        System.out.println(mainList);


    }
    
}
