package Graphs;

import java.util.*;

public class Graph_BipartiteGraph {
    
    static class Edge{
        int src;
        int des;

        public Edge(int s, int d){
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

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

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

        graph[6].add(new Edge(6,5));


    }
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){

        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.des]==false){
            dfs(graph,e.des,vis);
            }
        }
    }

    public static void bfs(ArrayList<Edge> graph[], int V){
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr]==false){
            System.out.print(curr + " ");
            vis[curr] = true;   
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
    }

    public static boolean isBipartite(ArrayList<Edge> graph[]){
        //Using the colour alogoritms

        int colour[] = new int[graph.length];
        for(int i=0;i<colour.length;i++){
            colour[i] = -1;
        }

        //BFS traversal + changing colour
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(colour[i]==-1){
                colour[i] = 0;//yellow
                q.add(i);

                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e = graph[curr].get(j);
                        if(colour[e.des] == -1){
                            int nextcol = colour[curr] == 0? 1 : 0;
                            colour[e.des] = nextcol;
                            q.add(e.des);
                        }else if(colour[e.des]==colour[curr]){
                            return false;
                        }
                    }
                }
            }


        }
        return true;

        
        
    }

    public static void main (String args[]){

        int V = 7;
        boolean vis[] = new boolean[V];
        for(int i=0;i<vis.length;i++){
            vis[i] = false;
        }
        ArrayList<Edge> graph[] = new ArrayList[V];
        //Create Graph Function
        createGraph(graph);

        //Graph Traversal ---> BFS
        //bfs(graph,V);

        System.out.println();

        //DFS Traversal  ---> DFS
        //dfs(graph,0,vis);

        //Check if the graph is bipartite
        System.out.println(isBipartite(graph));

        
        
    }
    
}


