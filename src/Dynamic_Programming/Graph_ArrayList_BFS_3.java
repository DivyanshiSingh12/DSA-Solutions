package Dynamic_Programming;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_ArrayList_BFS_3 {
     static class Edge{
        int src;
        int des;

        Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }

    public static void BFS(ArrayList<Edge> graph[], int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];

        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e  = graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }


    }

    public static void createGraph(ArrayList<Edge> graph[]){
        //Replacing null with empty array
        for (int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
    }
    public static void main(String args[]){
        int V=  7   ;
        /*
         1 --- 3
        /      | \
       0       |  5 --- 6
        \      |  /
         2 --- 4
         */
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        //Printing neighbours
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.des+" ");
        }
        //BFS Function
        BFS(graph, V);

    }
}
