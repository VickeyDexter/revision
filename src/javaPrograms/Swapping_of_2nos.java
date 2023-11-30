package javaPrograms;

public class Swapping_of_2nos {

	public static void main(String[] args) 
	{
    
		int a=1;
		int b=2;
		System.out.println("Number b4 swap:"+a+"   "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("No. after swap:"+a+"   "+b);
		
	}

}
