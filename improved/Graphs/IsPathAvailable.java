  public static boolean isPathAvailable(ArrayList<ArrayList<Integer>>graph,int src,int dest){
        Queue<Integer> qu = new ArrayDeque();
        boolean vis[] = new boolean[graph.size()];        
        qu.add(src);
        vis[src]=true;
        while(qu.size()>0){
            int ele = qu.remove();
            for(int nbr:graph.get(ele)){
                if(!vis[nbr]){
                    vis[nbr]=true;
                    qu.add(nbr);                    
                }
            }
        }        
        return vis[dest];
    }