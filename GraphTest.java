package directedAcyclicGraph;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class GraphTest {

	@Test
	public void testcreateEdge() {
		//ArrayList<Edge> edgeList;
		Graph graph=new Graph(3);
		graph.createEdge(1, 2, 5);
		graph.createEdge(1, 3, 12);
		graph.createEdge(3, 1, 12);
		graph.createEdge(2, 1, 5);
		graph.createEdge(2, 3, 7);
		graph.createEdge(3, 2, 7);

	}

}
