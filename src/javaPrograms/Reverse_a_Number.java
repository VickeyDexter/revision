package javaPrograms;

import java.util.Scanner;

public class Reverse_a_Number {

	public static void main(String[] args) 
	
	{
	//Logic :
   //Declare Scanner Class Object
   //Ask User for Input
   //Scanner obj variable reads input in the form of int & store that in a integer variable
  // We want reverse number from user's input so declare another varibable as rev & give value as 0 ; 
//While loop condition while(num!=0)
		//post reversing message for user
		
		// Scanner Object reads input value from any datatype
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dear User, Please Enter a Number of Your Choice");
		
		int num = sc.nextInt(); //Scanner object reference variable reads the data from the int data type
		
		int rev = 0; 
		
		while(num!=0)
		{
			rev = rev *10 + num%10;  //num =1234 > 0 = 0 +4 ;  4=40+12 = 152 ; 1520+152 = 2572
			num = num/10;//123 ; 12;  1
		}
		
System.out.println("Dear User, Your Input Number after Reversing is:" +rev);
	}

}
