import java.util.*;


public class Main {
  
    static class Pair{
    int neighbour;
    int weight;
        Pair(int aNeighbour,int aWeight){
            this.neighbour = aNeighbour;
            this.weight = aWeight;
        }
    }
    public static void main(String[] args) {
        int vtx = 7;
        int tedge = 8;
        int edges[][] = {
                {0,3,10},{0,1,5},{2,3,9},{3,4,3},{1,2,4},{4,5,7},{4,6,20},{5,6,15}
        };
        
        // prepare a graph list
        
        ArrayList<ArrayList<Pair>> graph = new ArrayList();
        for(int i=0;i<vtx;i++){
            graph.add(new ArrayList());
        }
        // add edges 
        for(int i=0;i<tedge;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            Pair p = new Pair(v,wt);
            graph.get(u).add(p);
        }
        
        // display graph
        for(int v=0;v<graph.size();v++){
            System.out.print("["+v+"] -> ");
            for(Pair np:graph.get(v)){
                System.out.print("["+np.neighbour+", "+np.weight+"], ");
            }
            System.out.println(".");
        }
        
    }
    
    
    

	
}