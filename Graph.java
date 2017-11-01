package directedAcyclicGraph;
import java.util.ArrayList;

public class Graph {
	
	public static ArrayList<Edge>[] adjList=null;
	public static int[] inEdgeCount=null;
	public int numberOfVertices;

	public Graph(int numberOfVertices)
	{
		adjList=(ArrayList<Edge>[])new ArrayList[numberOfVertices+1];
		
		for(int i=1 ; i<=numberOfVertices ; i++)
		{
			adjList[i]=new ArrayList<Edge>();
		}

		inEdgeCount=new int[numberOfVertices+1];
		//this.numberOfVertices=numberOfVertices;
	}

	public void createEdge(int a, int b, int c)
	{
		if(adjList[a]==null)
		{
			adjList[a]=new ArrayList<Edge>();
			adjList[a].add(new Edge(a, b, c));
		}
	}
	
	public void removeEdge(int a, int b)
	{
		int indexToBeRemoved=-1;
		ArrayList<Edge> edgeList=adjList[a];
		for(int i=0;i<adjList[a].size();i++)
		{
			Edge e=edgeList.get(i);
			if(e.a==a && e.b==b)
			{
				indexToBeRemoved=i;
			}
		}
		if(indexToBeRemoved!=-1)
			edgeList.remove(indexToBeRemoved);
	}
	
	
	public int[] EdgesCount()
	{
		for(int i=1;i<=numberOfVertices;i++)
		{
			for(int j=1;j<adjList.length;j++)
			{
				ArrayList<Edge> list=adjList[j];
				for(Edge e : list)
				{
					if(e.b==i)
						inEdgeCount[i]++;
				}
			}

		}
		return inEdgeCount;
	}
	
	
	

}
