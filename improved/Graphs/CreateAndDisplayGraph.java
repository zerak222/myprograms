import java.util.*;

public class Main {
  
 
    public static void main(String[] args) {
        int vtx = 7;
        int tedge = 8;
        int edges[][] = {
                {0,3},{0,1},{2,3},{3,4},{1,2},{4,5},{4,6},{5,6}
        };
        
        // prepare a graph list
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList();
        for(int i=0;i<vtx;i++){
            graph.add(new ArrayList());
        }
        // add edges 
        for(int i=0;i<tedge;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        // display graph
        for(int v=0;v<graph.size();v++){
            System.out.print("["+v+"] -> ");
            for(int nbr:graph.get(v)){
                System.out.print(nbr+", ");
            }
            System.out.println(".");
        }
        
    }
    
    
    

	
}