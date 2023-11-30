package javaPrograms;

import java.util.Scanner;

public class Check_Stringis_Palindrome {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value");
		
		String userval = sc.next();
		
		String pal = userval;
		
		String rev = "";
		
		int sl = userval.length(); 
		
		for(int i=sl-1; i>=0; i--)
		{
			rev= rev+userval.charAt(i);
		}
System.out.println("Number after Reverse:"+rev );
	if(pal==rev)
	{
		System.out.println("String is Palindrome:"+rev);
	}
	else
	{
		System.out.println("String is not palindrome"+rev);
}
}
}
