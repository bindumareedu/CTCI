package StringandArrays;

import java.util.ArrayList;

public class ZeroMatrix {
	
	public void rowZero(int[][]m, int r, int cols) {
		for(int i=0;i<cols;i++) {
			m[r][i]=0;
		}		
	}
	
	public void colZero(int[][]m, int c, int rows) {
		
		for(int i=0;i<rows;i++) {
			m[i][c]=0;
		}
	}

	public void matrix(int[][] m) {
		int rows=m.length;
		int cols=m[0].length;
		ArrayList<Integer> row=new ArrayList<>();
		ArrayList<Integer> col=new ArrayList<>();

		for(int i=0 ;i < rows; i++) {
			for(int j=0 ;j < cols; j++) {
				if(m[i][j]==0) {
	            row.add(i);
	            col.add(j);			
				}									
			}
		}
		for(int r:row) {
			rowZero(m,r,cols);
		}
		for(int c:col) {
			colZero(m,c,rows);
		}
	}
	
	public static void main(String[] args) {
		int[][] m= {{0,1,5,1},{4,6,7,2},{5,8,0,5},{3,9,1,9}};
		ZeroMatrix z= new ZeroMatrix();
		System.out.println("***Given Matrix***");
		for(int i=0 ;i < m.length; i++) {
			for(int j=0 ;j < m[0].length; j++) {
	            System.out.print(m[i][j]+"\t");		
				}	
		System.out.println("\n");
		}
		z.matrix(m);
		System.out.println("***Zero Matrix***");
		for(int i=0 ;i < m.length; i++) {
			for(int j=0 ;j < m[0].length; j++) {
	            System.out.print(m[i][j]+"\t");		
				}	
		System.out.println("\n");
		}
		
		
		}
		
	
}
