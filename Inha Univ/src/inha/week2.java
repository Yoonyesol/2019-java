package inha;

import java.util.Scanner;

public class week2 {
	
	public static long factorial(int n) {
		if(n==1)
			return n;
		else 
			return n * factorial(n-1);
		}
    
	public static void main(String[] args) {
		Scanner scv = new Scanner(System.in);
		System.out.println("Number : ");
		int j = scv.nextInt();
		
		long result = 1;
		for(int i=j; i>0; i--)
			result = result * i;
		
		System.out.println("Factorial Number : " + result);
		
	}
}