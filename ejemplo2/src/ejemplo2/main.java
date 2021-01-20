package ejemplo2;

import graph.Vertex;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertex v1 = new Vertex("v1");
		Vertex v2 = new Vertex("v2");
		Vertex v3 = new Vertex("v3");
		Vertex v4 = new Vertex("v4");
		Vertex v5 = new Vertex("v5");
		
		v1.connect(v2, 1);
		v1.connect(v3, 1);
		v1.connect(v5, 1);
		
		v2.connect(v1, 1);
		v2.connect(v4, 1);
		v2.connect(v5, 3);
		
		v3.connect(v1, 1);
		v3.connect(v4, 1);
		
		v4.connect(v2, 1);
		v4.connect(v3, 1);
		
		v5.connect(v2, 1);
		v5.connect(v1, 1);

	}

}
