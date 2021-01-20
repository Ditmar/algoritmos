package graphs;

public class Vertex {
	private String label;
	private Integer index;
	public Vertex(String label, Integer index) {
		this.label = label;
		this.index = index;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	
}
