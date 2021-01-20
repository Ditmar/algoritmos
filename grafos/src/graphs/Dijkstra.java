package graphs;

import java.util.ArrayList;

public class Dijkstra {
	private Integer[][] graph;
	private ArrayList<Vertex> vertex;
	private ArrayList<Label> labels;
	private Integer inf = 9999;
	public Dijkstra(Integer[][] g) {
		this.graph = g;
		this.vertex = new ArrayList<>();
		labels = new ArrayList<>();
		for (int i = 0; i < this.graph.length; i++) {
			Vertex v = new Vertex("v" + i, i);
			this.vertex.add(v);
			this.labels.add(new Label(inf , v, null, false));
		}
	}
	public void solve(Vertex source) {
		Label sourcelabel = this.labels.get(source.getIndex());
		sourcelabel.setParent(null);
		sourcelabel.setWeight(0);
		sourcelabel.setPermanent(true);
		while (!checkPermanent()) {
			//siguiente paso k
			for (Integer i = 0; i < this.graph.length; i++) {
				if (this.graph[source.getIndex()][i] < inf 
						&& this.labels.get(i).getPermanent() == false) {
					if (sourcelabel.getWeight() + this.graph[source.getIndex()][i] < this.labels.get(i).getWeight()) {
						Label newlabel = this.labels.get(i);
						newlabel.setWeight(sourcelabel.getWeight() + this.graph[source.getIndex()][i]);
						newlabel.setParent(source);
					}
				}
			}
			//Siguiente paso k
			//buscamos al menor;
			Integer minimus = inf;
			for (int i = 0; i < this.labels.size(); i++) {
				if (this.labels.get(i).getWeight() < minimus && this.labels.get(i).getPermanent() == false) {
					minimus = this.labels.get(i).getWeight();
					sourcelabel = this.labels.get(i);
				}
			}
			source = sourcelabel.getVertex();
			sourcelabel.setPermanent(true);
		}
	}
	public Boolean checkPermanent () {
		for (int i = 0; i < this.labels.size(); i++) {
			if (this.labels.get(i).getPermanent() == false) {
				return false;
			}
		}
		return true;
	}
	public Integer[][] getGraph() {
		return graph;
	}
	public void setGraph(Integer[][] graph) {
		this.graph = graph;
	}
	public ArrayList<Vertex> getVertex() {
		return vertex;
	}
	public void setVertex(ArrayList<Vertex> vertex) {
		this.vertex = vertex;
	}
	public ArrayList<Label> getLabels() {
		return labels;
	}
	public void setLabels(ArrayList<Label> labels) {
		this.labels = labels;
	}
	
	
}
