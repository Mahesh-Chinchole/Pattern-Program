package com.pattern;

public class Characcter_Pattern {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+i));
			}
			System.out.println();
		}
		
					
	}

}
