package ejemplo3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer inf = 9999;
		Integer[][] graph = {
				{inf, 3, inf, inf, inf, 3, 4},
				{3, inf, 10, inf, inf, 2, inf},
				{inf, 10, inf, 3, inf, 2, inf},
				{inf, inf, 3, inf, 4, inf, inf},
				{inf, inf, inf, 4, inf, 1, 3},
				{3, 2, 2, inf, 1, inf, 2},
				{4, inf, inf, inf, 3, 2, inf},
		}; 
		Prim prim = new Prim(graph);
		prim.apply();
		Integer[][] tree = prim.getTree();
		for (int l = 0; l < tree.length; l++){
			for (int m = 0; m < tree.length; m++){
				System.out.print(tree[l][m] + ",");
			}
			System.out.println();
		}
	}
}
