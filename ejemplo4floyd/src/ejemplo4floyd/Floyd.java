package ejemplo4floyd;

public class Floyd {
	Integer[][] matrix;
	Integer[][] path;
	public Floyd (Integer[][] matrix) {
		this.matrix = matrix;
		this.path = new Integer[this.matrix.length][this.matrix.length];
	}
	public Integer[][] getMatrix() {
		return matrix;
	}
	public void setMatrix(Integer[][] matrix) {
		this.matrix = matrix;
	}
	public Integer[][] getPath() {
		return path;
	}
	public void setPath(Integer[][] path) {
		this.path = path;
	}
	public void apply () {
		//inicializamos la matriz de rutas
		for (int i = 0; i < this.matrix.length; i++) {
			for (int j = 0; j < this.matrix.length; j++) {
				this.path[j][i] = i;
			}
		}
		for (int k = 0; k < this.matrix.length; k++) {
			for(int i = 0; i < this.matrix.length; i++) {
				for(int j = 0; j < this.matrix.length; j++) {
					Integer shortpath = this.matrix[i][k] + this.matrix[k][j];
					if (shortpath < this.matrix[i][j]) {
						this.matrix[i][j] = shortpath;
						this.path[i][j] = k;
					}
				}
			}
		}
	}
}
