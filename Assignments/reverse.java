package phase;

import java.util.Scanner;

public class reverse {
public static void main(String[] a) {
	Scanner myObj = new Scanner(System.in);
	String name = myObj.next();  
	for(int i=name.length()-1;i>=0;i--) {
		System.out.print(name.charAt(i));
	}
}
}
 
