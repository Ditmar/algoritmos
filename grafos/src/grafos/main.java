package grafos;

import java.util.ArrayList;

import graphs.Dijkstra;
import graphs.Label;
import graphs.Vertex;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{inf, inf, inf, inf, inf, inf, inf, inf, inf},
		Integer inf = 9999;
		Integer[][] matrix = {
				{inf, 1, inf, inf, inf, inf, inf, 5, 3},
				{inf, inf, 2, inf, inf, inf, inf, inf, inf},
				{inf, inf, inf, 4, inf, inf, inf, inf, inf},
				{inf, inf, inf, inf, inf, inf, 8, inf, inf},
				{inf, inf, inf, inf, inf, inf, 1, 2, inf},
				{inf, 10, 4, inf, 4, inf, inf, inf, inf},
				{inf, inf, inf, inf, inf, 3, inf, inf, inf},
				{inf, inf, inf, inf, inf, inf, inf, inf, inf},
				{inf, 10, inf, inf, inf, inf, inf, 3, inf},
		
		};
		Dijkstra dj = new Dijkstra(matrix);
		ArrayList<Vertex> vertex = dj.getVertex();
		dj.solve(vertex.get(0));
		ArrayList<Label> labels = dj.getLabels();
		
		for (int i = 0; i < labels.size();  i++) {
			if (labels.get(i).getParent() != null) {
				System.out.println("[ " + labels.get(i).getWeight() + " ," + labels.get(i).getParent().getIndex() + "]");
				
			} else {
				System.out.println("[ " + labels.get(i).getWeight() + " ,-]");
				
			}
		}
	}

}
