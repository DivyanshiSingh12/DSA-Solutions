package Graphs;
import java.util.*;
public class Graph_ConnectingFlights{

    static class Edge{
        int s;
        int d;
        int wt;

        public Edge(int s,int d,int wt){
            this.s = s;
            this.d = d;
            this.wt = wt;
        }
    }

    public static void createGraph(int flights[][], ArrayList<Edge> graph){

        for

    }

    public static void main(String args){
        int n = 4;
        int flights[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0;
        int des = 3;

        //Converting the above array to graph 
        ArrayList<Edge> graph[] = new ArrayList[n];


    }
}