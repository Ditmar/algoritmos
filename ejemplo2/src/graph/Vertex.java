package graph;

import java.util.ArrayList;

public class Vertex {
	private String label;
	private ArrayList<Edges> edges;
	public Vertex(String label) {
		this.label = label;
		edges = new ArrayList<Edges>();
	}
	public void connect(Vertex vertex, Integer weigth) {
		
		Edges v1 = new Edges(this, vertex, weigth);
		edges.add(v1);
	}
	public void removeEdge(Edges e) {
		edges.remove(e);
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public ArrayList<Edges> getEdges() {
		return edges;
	}
	public void setEdges(ArrayList<Edges> edges) {
		this.edges = edges;
	}

}
