package Greedy_Algorithms;
import java.util.*;

public class Greedy_Algorithm_JobSequencing {

    public class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
            deadline = d;
            profit = p;
            id = i;
        }
    }

    public static void main(String args[]){
        int  JobsInfo[][] ={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0;i<JobsInfo.length;i++){
        jobs.add(new Job(i, Jobsintnfo[i][0], JobsInfo[i][1]));
        }


    }
    
}
