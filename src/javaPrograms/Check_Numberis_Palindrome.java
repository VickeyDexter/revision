package javaPrograms;

import java.util.Scanner;

public class Check_Numberis_Palindrome {

	public static void main(String[] args) 
	
	{
		//Palindrome means A number even after ts digits are reversed remains the same eg., 16461
		
		//Logic
		/* Use Scanner class get number from user store it in int var
		 * Take another var ie.,int pal_num = num; palindrome number variable equals to the number entered by the user
		 * int rev =0;
		 * while loop
		 * if(pal_num==rev) then number is palindrome 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int num= sc.nextInt();
		
		int pal_num = num;
		
		int rev=0;
		
		while(num!=0)
		{
			rev= rev*10+num%10;
			num=num/10;
		}
	
		if(pal_num==rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	
	}
	
	
	

}
