package ejemplo4floyd;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer inf = Constantes.inf;
		Integer[][] matrix = {
				{inf, 10, 6, 2},
				{inf, inf, inf, 3},
				{inf, 3, inf, inf},
				{2, 12, 1, inf},
				};
		Floyd floyd = new Floyd(matrix);
		floyd.apply();
		Integer[][]path = floyd.getPath();
		Integer[][]resultmatrix = floyd.getMatrix();
		System.out.println("Matriz de Rutas");
		for (int i = 0; i < path.length; i++) {
			for (int j = 0; j < path.length; j++) {
				System.out.print( path[i][j] + ",");
			}
			System.out.println();
		}
		System.out.println("Matriz de pesos");
		for (int i = 0; i < resultmatrix.length; i++) {
			for (int j = 0; j < resultmatrix.length; j++) {
				System.out.print( resultmatrix[i][j] + ",");
			}
			System.out.println();
		}
		
	}

}
