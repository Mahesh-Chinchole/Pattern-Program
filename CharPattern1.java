package com.pattern;

public class CharPattern1 {

	public static void main(String[] args) {
		char ch='A';
		for(int i=1;i<7;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}