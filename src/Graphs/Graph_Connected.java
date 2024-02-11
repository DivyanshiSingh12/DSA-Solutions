package Graphs;
import java.util.ArrayList;

import Queue.Queue_1;

import java.util.*;

public class Graph_Connected {
    static class Edge{
        int src;
        int des;

        Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
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
    public static void BFS(ArrayList<Edge> graph[], int V){
      boolean vis[] = new boolean[V];
      for(int i=0;i<graph.length;i++){
        if(!vis[i]){
        BFSutil(graph, V, vis);
        }
      }
    }

    public static void BFSutil(ArrayList<Edge> graph[], int V, boolean vis[]){
      Queue_1<Integer> q = new LinkedList<>();
      
      q.add(0);

      while(!q.isEmpty()){
        int curr = q.remove();
        if (vis[curr]==false){
            System.out.print(curr);
            vis[curr] = true;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            q.add(e.des);
        }
      }

    }
    public static void DFS(ArrayList<Edge> graph[], int V){
        boolean vis[] = new boolean[V];
        for(int i=0;i<graph.length;i++){
            if(vis[i]==false){
                DFSutil(graph, V, vis, i);
            }
        }
    }
    
    public static void DFSutil(ArrayList<Edge> graph[],int V, boolean vis[], int curr ){
      System.out.print(curr);
      vis[curr] = true;

      for(int i=0;i<graph[curr].size();i++){
        Edge e = graph[curr].get(i);
        if(vis[e.des]==false){
            DFSutil(graph, V, vis, e.des);
        }
      }
    }
    
    public static void main(String args[]){
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        BFS(graph, V);
        DFS(graph, V);

    }
}
