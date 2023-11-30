package javaPrograms;

public class Reverse_a_String {

	public static void main(String[] args) 
	{
		String var = "ABCD";
		
		System.out.println("Normal String:"+var);
		
		String rev = "";
		
		//Find String length
		int sl = var.length(); //4
				
	    for(int i= sl-1;i>=0; i--)
	    {
	    	rev=rev+var.charAt(i);
	    }
            System.out.println("String after reversal:" +rev);
	}

}
