import javax.swing.ToolTipManager;

class Prims{
    final static int TOTAL_VERTEX = 6;
    
    
    static void primsAlgo(int [][] graphs){
        // Create 3 Arrays
        // Store the Weights
        int weights [] = new int[TOTAL_VERTEX];
        weights[0] = 0; // so first weight is the smaller
        // All the Remaining Weights are consider as MAX
        for(int i = 1; i<weights.length; i++){
            weights[i] = Integer.MAX_VALUE;
        }
        // MSET Array
        boolean mset [] = new boolean[TOTAL_VERTEX];
        // Parent Array
        int parent [] = new int[TOTAL_VERTEX];
        parent[0] = -1; // SOurce vertex not having parent

        // Loop for MST (V-1) Edges
        for(int i = 0 ; i<TOTAL_VERTEX-1; i++){
            // get the source vertex (Minimum)
            int sourceVertex = getMinVertex(weights, mset);
            mset[sourceVertex] = true; // Mark it used in MST 

            // After Getting the Source Vertex than get the Adjacent Vertex 
            //and do the Relax Operations (Weights Update)
            for(int j =0; j<TOTAL_VERTEX; j++){
                // Graph Cell weight not be 0 and MSET[index] is false (Not Part of MST) and graph[row][col] value < weight[index]
                if(graphs[sourceVertex][j]!=0 && !mset[j] 
                && graphs[sourceVertex][j]<weights[j]){
                    // Now do the relax operation (Update)
                    weights[j] = graphs[sourceVertex][j];
                    parent[j] = sourceVertex;
                }
            }
           
        }

        // Print MST
        for(int i = 1; i<TOTAL_VERTEX; i++){
            System.out.println(parent[i]+" "+i+"  "+graphs[parent[i]][i]);
        }


    }

    static int getMinVertex(int [] weights, boolean mset[]){
        int min = Integer.MAX_VALUE;
        int vertex =-1;
        for(int i = 0; i<TOTAL_VERTEX; i++){
            if(!mset[i] && weights[i]<min){
                vertex = i;
                min = weights[i];
            }
        }
        return vertex; // Become Source Vertex
    }

    public static void main(String[] args) {
     
     int graph[][] = {
        {0,4,6,0,0,0},
        {4,0,6,3,4,0},
        {6,6,0,1,0,0},
        {0,3,1,0,2,3},
        {0,4,0,2,0,7},
        {0,0,0,3,7,0}
     };
     primsAlgo(graph);
     
    }
}