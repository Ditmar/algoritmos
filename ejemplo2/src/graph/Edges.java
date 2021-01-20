package graph;

public class Edges {
	private Vertex source;
	private Vertex destination;
	private Integer weigth; 
	public Edges(Vertex source, Vertex destination, Integer weigth) {
		this.source = source;
		this.destination = destination;
		this.weigth = weigth;
	}
	public Vertex getSource() {
		return source;
	}
	public void setSource(Vertex source) {
		this.source = source;
	}
	public Vertex getDestination() {
		return destination;
	}
	public void setDestination(Vertex destination) {
		this.destination = destination;
	}
	public Integer getWeigth() {
		return weigth;
	}
	public void setWeigth(Integer weigth) {
		this.weigth = weigth;
	}
	
}
