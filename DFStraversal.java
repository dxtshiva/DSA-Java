import java.util.*;

public class DFStraversal{
    private int V;
    private LinkedList<Integer> adj[];
    @SuppressWarnings("unchecked")
    DFStraversal(int v){
        V=v;
        adj = new LinkedList[v+1];
        for(int i=0;i<v;i++)
            adj[i]=new LinkedList<>();
    }
    void insertEdge(int v, int e) {
        adj[v].add(e);
    }
    void TraverseDFS(int v, boolean visited[]){
        visited[v]=true;
        System.out.print(v+" ");

        Iterator<Integer> itr = adj[v].listIterator();
        while(itr.hasNext()){
            int n = itr.next();
            if(!visited[n]) 
                TraverseDFS(n, visited);
        }
    }
    void DFS(int v){
        boolean visited[] = new boolean[V];
        TraverseDFS(v,visited);
    }
    
    public static void main(String[] args) {
       DFStraversal dfs = new DFStraversal(9);
       dfs.insertEdge(0, 1);
       dfs.insertEdge(1, 2);
       dfs.insertEdge(1, 3); 
       dfs.insertEdge(1, 4);
       dfs.insertEdge(1, 5);
       dfs.insertEdge(2, 6);
       dfs.insertEdge(3, 6);
       dfs.insertEdge(4, 7);
       dfs.insertEdge(5, 7);
       dfs.insertEdge(6, 8);
       dfs.insertEdge(7, 8);

       dfs.DFS(1);
    }
}
