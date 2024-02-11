package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_AllPaths {
    static class Edge{
        int src;
        int des;

        Edge(int s, int d){
         this.src = s;
         this.des = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
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

    public static void DFS(ArrayList<Edge> graph[], int curr, boolean vis[]){
       System.out.print(curr);
       vis[curr] = true;

       for(int i=0;i<graph[curr].size();i++){
        Edge e = graph[curr].get(i);
        if(vis[e.des]==false){
            DFS(graph,e.des,vis);
        }
       }

    }

    public static void BFS(ArrayList<Edge> graph[], int V){
       Queue<Integer> q = new LinkedList<>();
       boolean vis[] = new boolean[V];
       q.add(0);

       while(!q.isEmpty()){
        int curr = q.remove();
        if(vis[curr]==false){
            System.out.print(curr+" ");
            vis[curr] = true;

            for(int i=0; i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                q.add(e.des);
            }
        }

       }
    }

    public static void printAllPath(ArrayList<Edge> graph[], boolean vis[], int curr, int tar, String path){
        if(curr == tar){
            System.out.println(path);
            return;
        }

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.des]){
                vis[curr] = true;
                printAllPath(graph, vis, e.des, tar, path+e.des);
                vis[curr] = false;
            }
        }
    }

    public static boolean hasPath(ArrayList<Edge> graph[], int src, int des, boolean vis[]){
        if (src == des){
            return true;
        }
    vis[src] = true;
     for(int i=0;i<graph[src].size();i++){
        Edge e = graph[src].get(i);
        if(!vis[e.des] && hasPath(graph, e.des, des, vis)){
            return true;
        }
     }
     return false;
    }
    public static void main(String args[]){
       int V = 7;
       ArrayList<Edge> graph[] = new ArrayList[V];
       createGraph(graph);
       boolean vis[] = new boolean[V];
       //BFS(graph, V);
       //DFS(graph,0,vis);
       String path = " ";
       int src =0;
       int tar =5;
       //printAllPath(graph, vis, 0, tar, path);
       //Has Path
       boolean x = hasPath(graph, src, tar, vis);
       System.out.println(x);
    }
}
