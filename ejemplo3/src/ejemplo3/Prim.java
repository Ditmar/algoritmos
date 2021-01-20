package ejemplo3;

import java.util.ArrayList;

public class Prim {
	private Integer[][] graph;
	private Integer[][] tree;
	private ArrayList<Vertex> C;
	private ArrayList<Vertex> C_C;
	public Prim(Integer[][] graph) {
		this.graph = graph;
		this.tree = new Integer[this.graph.length][this.graph.length];
		C = new ArrayList<Vertex>();
		C_C = new ArrayList<Vertex>();	
	}
	public void apply() {
		//paso -1
		for (int l = 0; l < this.tree.length; l++){
			for (int m = 0; m < this.tree.length; m++){
				this.tree[l][m] = 9999;
			}
		}
		//paso 0
		Integer i = 0;
		for (i = 0; i < this.graph.length; i++){
			Vertex v = new Vertex("v " + i);
			v.setIndex(i);
			C_C.add(v);
		}
		//paso 1
		Vertex j = C_C.get(0);
		C.add(j);
		C_C.remove(j);
		//paso k
		while (!C_C.isEmpty()) {
			j = EdgeShort();
			C.add(j);
			C_C.remove(j);
		}
	}
	public Vertex EdgeShort() {
		Vertex J = null;
		Vertex I = null;
		Integer minimus = 9999;
		for(int i = 0; i < C.size(); i++) {
			for(int j = 0; j < C_C.size(); j++) {
				if (this.graph[C.get(i).getIndex()][C_C.get(j).getIndex()] < minimus) {
					J = C_C.get(j);
					I = C.get(i);
					minimus = this.graph[C.get(i).getIndex()][C_C.get(j).getIndex()];
				}
			}
		}
		this.tree[I.getIndex()][J.getIndex()] = this.graph[I.getIndex()][J.getIndex()];
		this.tree[J.getIndex()][I.getIndex()] = this.graph[J.getIndex()][I.getIndex()];
		return J;
	}
	public Integer[][] getGraph() {
		return graph;
	}
	public void setGraph(Integer[][] graph) {
		this.graph = graph;
	}
	public Integer[][] getTree() {
		return tree;
	}
	public void setTree(Integer[][] tree) {
		this.tree = tree;
	}
	public ArrayList<Vertex> getC() {
		return C;
	}
	public void setC(ArrayList<Vertex> c) {
		C = c;
	}
	public ArrayList<Vertex> getC_C() {
		return C_C;
	}
	public void setC_C(ArrayList<Vertex> c_C) {
		C_C = c_C;
	}
}
