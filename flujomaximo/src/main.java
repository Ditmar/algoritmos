import graph.Vertex;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertex v1 = new Vertex("v1");
		Vertex v2 = new Vertex("v2");
		Vertex v3 = new Vertex("v3");
		Vertex v4 = new Vertex("v4");
		Vertex v5 = new Vertex("v5");
		v1.connect(v2, 10.0, 0.0);
		v1.connect(v4, 30.0, 0.0);
		v1.connect(v5, 5.0, 0.0);
		v2.connect(v3, 10.0, 5.0);
		v2.connect(v4, 30.0, 0.0);
		v3.connect(v4, 50.0, 0.0);
		v5.connect(v4, 10.0, 0.0);
		
	}

}
