package revision_Programs;

public class Swap_2nos {

	public static void main(String[] args) 
	
	{
		int a=1;
		int b=10;
		System.out.println("Numbers before Swap:" +a+   "  "   +b);
		
		//Swap 2 numbers
		a=a+b; //11
		b=a-b; //1
		
		a=a-b;//10
		System.out.println("Numbers after Swap:" +a+  " " +b);
	}

}
