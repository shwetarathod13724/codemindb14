package javapractices;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		 
		Scanner scanner= new Scanner (System.in);
		System.out.println("plz enter no to check prime or not" );
		int num=Integer.parseInt(scanner.next());
		boolean prime=false;
		
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				prime=false;
				break;
			}
			if(num%i!=0)
			{
				prime=true;
			}
		}
		if(prime)
		System.out.println("number is prime");
		else
			System.out.println("number is not prime");
		// TODO Auto-generated method stub

	}

}
