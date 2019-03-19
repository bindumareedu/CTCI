package StringandArrays;

import java.util.Arrays;

public class smallest {
	
	static int smallest_no(int[] A, int[] B){
		int n=A.length;
		int m=B.length;
		Arrays.sort(A);
		Arrays.sort(B);
		int i=0;
		for(int k=0;k<n; k++)
		{
			while(i<m-1 && B[i]<A[k])
				i+=1;
			if(A[k]==B[i])
			    return A[k];

		}
		return -1;
	}
public static void main(String[] args) {
	int[] A= {1,3,2,1,0};
	int[] B= {4,3,5,3,2,0};
	System.out.println(smallest_no(A,B));
	
}
}
