package Java_Project2;

import java.util.Scanner;

public class FactorialWhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number f");
		int n=sc.nextInt();
		int fact=1;
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("factorial of "+n+" is "+fact);
	}

}
