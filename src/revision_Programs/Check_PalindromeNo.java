package revision_Programs;

import java.util.Scanner;

public class Check_PalindromeNo {

	public static void main(String[] args) 
	
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
    int num = sc.nextInt();
    
    int pal_num = num;
    
    int rev =0;
    
    while(num!=0)
    {
    	rev= rev*10 + num%10;
       num=num/10;
    }
	if(pal_num==rev)
	{
		System.out.println("Number is Palindrome:"+pal_num);
	}
	else
	{
		System.out.println("Number is not Palindrome");
	}
	}

}
