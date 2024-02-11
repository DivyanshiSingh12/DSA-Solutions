package Arrays;
import java.util.ArrayList;

public class MergeList {

    class Interval{
        int start;
        int end;

        Interval(int s, int e){
            this.start = s;
            this.end = e;
        }
    }

    public static void main(String args[]){
        Interval i = new Interval(0, 0);
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(1, 3));

    }
    
}
