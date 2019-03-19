package StringandArrays;

public class RotateMatrix {
	
	public void rotate(int[][] M) {
		int rows=M.length;
		int cols=M[0].length;
		int[][] M1= new int[rows][cols];
		for(int i=0; i < Math.max(rows, cols) ; i++) {
			for(int j=0; j< Math.min(rows, cols); j++) {
				M1[i][j]=M[j][i];
			}
		}
		for(int i=0; i < Math.max(rows, cols) ; i++) {
			for(int j=0; j< Math.min(rows, cols); j++) {
			System.out.print("\t"+M1[i][j]);	
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
		int[][] M= {{0,1,0},
					{0,1,0},
					{0,0,0},
					{1,1,1}};
		RotateMatrix r= new RotateMatrix();
		r.rotate(M);
		
	}
}
