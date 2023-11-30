package javaPrograms;

public class FindEvenOddinArray {

	public static void main(String[] args) 
	
	{
		int a[] = {1,2,3,4,5,6};

		//To Print Even Numbers
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			System.out.println(a[i]);
		}
		
		//To Print Odd Numbers in Array
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		
		
		
		
		
	}

}
