package revision_Programs;

public class Reverse_String {

	public static void main(String[] args) 
	
	{
 String var = "ABCD";
 String rev = "";
 System.out.println("String before reverse:"+var);
 //Length of the String 
 int strlength = var.length();//4
 
 //for loop used for string & while loop used for number
 
 for(int i=strlength-1;i>=0;i--)
 {
	 rev=rev+var.charAt(i);
 }

System.out.println("String after reverse:"+rev);
	}

}
