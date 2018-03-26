/******************************************************************************
  
 *  Purpose: Determines the primenumber program using 2D
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   08-03-2018
 *
 ******************************************************************************/




package com.bridgeit.datastructure;
public class PrimeNumber2D 
{
 public static void main(String[] args) 
 {
	 int array[][]=new int[10][];
	 int initial=2,temp=100;
		int i,j,k;
		for(i=0; i<10; i++) {
			int size=0;
			for(j=initial; j<temp; j++)
			{
				boolean flag=true;
				for(k=2; k<j; k++)
				{
					if(j%k==0)
					{
						flag=false;
						break;
					}					
				}
				if(flag==true)
				{
					size++;
				}
			}
			array[i]=new int[size];
			j=0;
			int m;
			for(m=initial; m<temp; m++)
			{
				boolean temp1=true;
				for(int q=2; q<m; q++)
				{
					if(m%q==0)
					{
						temp1=false;
						break;
					}
				}
				
				if(temp1==true)
				{
					array[i][j]=m;
					System.out.print(array[i][j]+"  ");
					j++;
				}
			}
			System.out.println();
			initial=temp;
			temp=temp+100;
}
}
}