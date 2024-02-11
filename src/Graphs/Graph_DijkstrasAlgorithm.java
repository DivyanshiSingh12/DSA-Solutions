package Graphs;
import java.util.*;
public class Graph_DijkstrasAlgorithm {

    static class Edge{
        int src;
        int des;
        int weight;

        public Edge(int s, int d, int w){
            this.src = s;
            this.des = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();

        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new  Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));


    } 

    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair(int n, int path){
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }

    public static void dijktra(ArrayList<Edge> graph[], int src){
         int dis[] = new int[graph.length];
         boolean vis[] = new boolean[graph.length];
         for(int i=0;i<dis.length;i++){
            if(i != src){
                dis[i] =Integer.MAX_VALUE;
            }
         }

         PriorityQueue<Pair> q = new PriorityQueue<>();
         q.add(new Pair(src, src));

         while(!q.isEmpty()){
            Pair curr = q.remove();
            if(!vis[curr.n]){
                vis[curr.n] = true;
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.des;
                    int wt = e.weight;
                    if(dis[u]+wt<dis[v]){
                        dis[v] = dis[u]+wt;
                        q.add(new Pair(v,dis[v]));
                    }
                }
            }
         }

         //print all shortest distance from src to des
         for(int i=0;i<dis.length;i++){
            System.out.print(dis[i]+" ");
         }
         System.out.println();
    }

    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 0;
        dijktra(graph, src);

    }
    
}
