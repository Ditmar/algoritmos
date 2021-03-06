package graphs;

public class Label {
	private Integer weight;
	private Vertex vertex;
	private Vertex parent;
	private Boolean permanent;
	public Label (Integer w, Vertex v, Vertex parent,Boolean  permanent) {
		this.weight = w;
		this.vertex = v;
		this.parent = parent;
		this.permanent = permanent;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Vertex getVertex() {
		return vertex;
	}
	public void setVertex(Vertex vertex) {
		this.vertex = vertex;
	}
	public Boolean getPermanent() {
		return permanent;
	}
	public void setPermanent(Boolean permanent) {
		this.permanent = permanent;
	}
	public Vertex getParent() {
		return parent;
	}
	public void setParent(Vertex parent) {
		this.parent = parent;
	}
	
	
}
