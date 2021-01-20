package graph;

public class Edge {
	private double weigth;
	private double capabilities;
	private double sink;
	private Vertex source;
	private Vertex destination;
	public Edge(double weigth) {
		this.weigth = weigth;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	public double getCapabilities() {
		return capabilities;
	}
	public void setCapabilities(double capabilities) {
		this.capabilities = capabilities;
	}
	public double getSink() {
		return sink;
	}
	public void setSink(double sink) {
		this.sink = sink;
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
	
}
