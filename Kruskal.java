import java.util.Arrays;

public class Kruskal {
    class Edge implements Comparable<Edge>
    {
        int src, dest, weight;
 
        public int compareTo(Edge compareEdge)
        {
            return this.weight - compareEdge.weight;
        }
    };
 
    class subset
    {
        int parent, rank;
    };
 
    int V, E; 
    Edge edge[]; 
    Kruskal(int v, int e){
        V = v;
        E = e;
        edge = new Edge[E];
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }

    int find(subset subsets[], int i)
    {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);
 
        return subsets[i].parent;
    }

    void Union(subset subsets[], int x, int y)
    {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);
 
        if (subsets[xroot].rank
            < subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank
                 > subsets[yroot].rank)
            subsets[yroot].parent = xroot;
 
        else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }
    void KruskalMST()
    {

        Edge result[] = new Edge[V];

        int e = 0;

        int i = 0;
        for (i = 0; i < V; ++i)
            result[i] = new Edge();

        Arrays.sort(edge);
 
        subset subsets[] = new subset[V];
        for (i = 0; i < V; ++i)
            subsets[i] = new subset();
 
       
        for (int v = 0; v < V; ++v)
        {
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }
 
        i = 0; 

        while (e < V - 1)
        {

            Edge next_edge = edge[i++];
 
            int x = find(subsets, next_edge.src);
            int y = find(subsets, next_edge.dest);

            if (x != y) {
                result[e++] = next_edge;
                Union(subsets, x, y);
            }
          
        }

        System.out.println("Edges in the constructed MST are: ");
        int minimumCost = 0;
        for (i = 0; i < e; ++i)
        {
            System.out.println(result[i].src + " ===== " + result[i].dest + " ---> " + result[i].weight);
            minimumCost += result[i].weight;
        }
        System.out.println("Minimum Cost Spanning Tree " + minimumCost);
    }
    public static void main(String[] args) {
        int V = 9;
        int E = 14;

        Kruskal k = new Kruskal(V, E);

        k.edge[0].src=0;
        k.edge[0].dest = 1;
        k.edge[0].weight=4;

        k.edge[1].src=0;
        k.edge[1].dest = 8;
        k.edge[1].weight=8;

        k.edge[2].src=1;
        k.edge[2].dest =3;
        k.edge[2].weight=8;
        
        k.edge[3].src=1;
        k.edge[3].dest = 8;
        k.edge[3].weight=11;
        
        k.edge[4].src=3;
        k.edge[4].dest = 2;
        k.edge[4].weight=2;
        
        k.edge[5].src=3;
        k.edge[5].dest = 4;
        k.edge[5].weight=7;
        
        k.edge[6].src=3;
        k.edge[6].dest = 6;
        k.edge[6].weight=4;
        
        k.edge[7].src=2;
        k.edge[7].dest = 8;
        k.edge[7].weight=7;
        
        k.edge[8].src=4;
        k.edge[8].dest = 6;
        k.edge[8].weight=14;
        
        k.edge[9].src=4;
        k.edge[9].dest = 5;
        k.edge[9].weight=9;
        
        k.edge[10].src=5;
        k.edge[10].dest =6 ;
        k.edge[10].weight=10;
        
        k.edge[11].src=2;
        k.edge[11].dest = 7;
        k.edge[11].weight=6;
        
        k.edge[12].src=8;
        k.edge[12].dest = 7;
        k.edge[12].weight=1;

        k.edge[13].src=7;
        k.edge[13].dest = 6;
        k.edge[13].weight=2;

        k.KruskalMST();

    }
}
