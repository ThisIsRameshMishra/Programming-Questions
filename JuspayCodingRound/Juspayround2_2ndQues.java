import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Juspayround2_2ndQues {
	ArrayList<ArrayList<Integer>> pt=new ArrayList<ArrayList<Integer>>();
	static ArrayList<ArrayList<Integer>> p=new ArrayList<ArrayList<Integer>>();
static ArrayList<Integer> ans=new ArrayList<>();
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);// TODO Auto-generated method stub
		 int[][] adjacencyMatrix = { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                 { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                 { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                 { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                 { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                 { 0, 0, 4, 0, 10, 0, 2, 0, 0 },
                 { 0, 0, 0, 14, 0, 2, 0, 1, 6 },
                 { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                 { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
dijkstra(adjacencyMatrix, 0);
System.out.println(p);

 	
	}
	 private static final int NO_PARENT = -1;
	 
	    
	    private static void dijkstra(int[][] adjacencyMatrix,
	                                        int startVertex)
	    {
	        int nVertices = adjacencyMatrix[0].length;
	 
	
	        int[] shortestDistances = new int[nVertices];
	 
	        boolean[] added = new boolean[nVertices];
	 
	    
	        for (int vertexIndex = 0; vertexIndex < nVertices;
	                                            vertexIndex++)
	        {
	            shortestDistances[vertexIndex] = Integer.MAX_VALUE;
	            added[vertexIndex] = false;
	        }
	         
	  
	        shortestDistances[startVertex] = 0;
	
	        int[] parents = new int[nVertices];
	 
	      
	        parents[startVertex] = NO_PARENT;
	 
	        // Find shortest path for all
	        // vertices
	        for (int i = 1; i < nVertices; i++)
	        {
	 
	         
	            int nearestVertex = -1;
	            int shortestDistance = Integer.MAX_VALUE;
	            for (int vertexIndex = 0;
	                     vertexIndex < nVertices;
	                     vertexIndex++)
	            {
	                if (!added[vertexIndex] &&
	                    shortestDistances[vertexIndex] <
	                    shortestDistance)
	                {
	                    nearestVertex = vertexIndex;
	                    shortestDistance = shortestDistances[vertexIndex];
	                }
	            }
	 
	            // Mark the picked vertex as
	            // processed
	            added[nearestVertex] = true;
	 
	            // Update dist value of the
	            // adjacent vertices of the
	            // picked vertex.
	            for (int vertexIndex = 0;
	                     vertexIndex < nVertices;
	                     vertexIndex++)
	            {
	                int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex];
	                 
	                if (edgeDistance > 0
	                    && ((shortestDistance + edgeDistance) <
	                        shortestDistances[vertexIndex]))
	                {
	                    parents[vertexIndex] = nearestVertex;
	                    shortestDistances[vertexIndex] = shortestDistance +
	                                                       edgeDistance;
	                }
	            }
	        }
	 
	        printSolution(startVertex, shortestDistances, parents);
	    }
	 
	    
	    private static void printSolution(int startVertex,
	                                      int[] distances,
	                                      int[] parents)
	    {
	        int nVertices = distances.length;
	        
	         
	        for (int vertexIndex = 0;
	                 vertexIndex < nVertices;
	                 vertexIndex++)
	        {
	            if (vertexIndex != startVertex)
	            {
	               
	                printPath(vertexIndex, parents);
	            }
	        }
	    }
	 
	    private static void printPath(int currentVertex,
	                                  int[] parents)
	    {
	         
	        // Base case : Source node has
	        // been processed
	    	
	        if (currentVertex == NO_PARENT)
	        {
	            return;
	        }
	        ans=new ArrayList<Integer>();
	        printPath(parents[currentVertex], parents);
	        ans.add(currentVertex);
	        
	        p.add(ans);
	        
	    }

}
