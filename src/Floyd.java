package com.pack;
import java.util.*;
public class Floyd {
	public void floyd_method(int D[][],int n)
	{
		int i,j,k;
		for(k=1;k<=n;k++)
			for(i=1;i<=n;i++) 
				for(j=1;j<=n;j++) 
					D[i][j]=Math.min(D[i][j],D[i][k]+D[k][j]);
		System.out.println("The shortest distance is");
		for(i=1;i<=n;i++) 
		{
			for(j=1;j<=n;j++) 
			{
				System.out.print(D[i][j]+"\t");	
		}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		Floyd f=new Floyd();
		Scanner s=new Scanner(System.in);
		int D[][]=new int[10][10];
		System.out.println("Enter the number of nodes");
		n=s.nextInt();
		System.out.println("Enter the weighted matrixs ");
        for(i=1;i<=n;i++) 
        	  for(j=1;j<=n;j++) 
        		  D[i][j]=s.nextInt();
        
        f.floyd_method(D,n);
        	
		

	}

}
