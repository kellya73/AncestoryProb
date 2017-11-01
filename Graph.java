package directedAcyclicGraph;
import java.util.ArrayList;

public class Graph {
	public static ArrayList<Edge>[] adjacencyList=null;
	public static int[] inEdgeCount=null;
	public int numberOfVertices;

	public Graph(int numberOfVertices)
	{
		adjacencyList=(ArrayList<Edge>[])new ArrayList[numberOfVertices+1];
		
		for(int i=1 ; i<=numberOfVertices ; i++)
		{
			adjacencyList[i]=new ArrayList<Edge>();
		}
		
		inEdgeCount=new int[numberOfVertices+1];
		this.numberOfVertices=numberOfVertices;
	}
	
	

}
