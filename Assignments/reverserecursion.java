package phase;

import java.util.Scanner;

public class reverserecursion {
	void reverseString(String string)   
	{   
	if ((string==null)||(string.length() <= 1))   
	System.out.println(string);   
	else  
	{   
	System.out.print(string.charAt(string.length()-1));   
	reverseString(string.substring(0,string.length()-1));   
	}   
	}   
	public static void main(String[] args)   
	{   
	Scanner myObj = new Scanner(System.in);
	String str = myObj.next();
	reverserecursion rs = new reverserecursion ();  
	rs.reverseString(str);   
	}        
}
