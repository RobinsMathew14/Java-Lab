package oobj24cseb63;

import java.util.Scanner;

public class Multiplication {
public static void main(String[] args) {
	int i,j,k,rowA,rowB,colA,colB;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of row and col of matrixA");
	rowA=sc.nextInt();
	colA=sc.nextInt();
	System.out.println("Enter the number of row and col of matrixB");
	rowB=sc.nextInt();
	colB=sc.nextInt();
	if (colA!=rowB) {
		System.out.println("The operation multiplication is not possible");
		return;
	}
	int[][]matrixA=new int[rowA][colA];
	System.out.println("Enter the first matrix");
	for(i=0;i<rowA;i++) 
	{for(j=0;j<colA;j++) {
		matrixA[i][j]=sc.nextInt();
		}
	}
	
	int[][]matrixB=new int[rowB][colB];
	System.out.println("Enter the Second matrix");
	for(i=0;i<rowB;i++) 
	{for(j=0;j<colB;j++) {
		matrixB[i][j]=sc.nextInt();
		}
	}
	int[] []matrixC=new int[rowA][colB];
	System.out.println("The product of matrix is..");
	for(i=0;i<rowA;i++) 
	{ 
		for(j=0;j<colB;j++) {
			matrixC[i][j]=0;
		for(k=0;k<colA;k++) {
			matrixC[i][j]+=matrixA[i][k]*matrixB[k][j];
		}
		System.out.print(matrixC[i][j]+" ");
		}
	System.out.println();
	}
	sc.close();
}
}