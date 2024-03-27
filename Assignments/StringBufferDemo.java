package phase;
import java.util.Scanner;
import java.util.Arrays;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("PRIYA");
		StringBuffer str2 = new StringBuffer();
		StringBuffer str3 = new StringBuffer(30);
		
		System.out.println(str1.capacity());
		System.out.println(str2.capacity());
		System.out.println(str3.capacity());
	
		System.out.println(str1.append("!!!"));
		System.out.println("****************");
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
		
		System.out.println("****************");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());

		System.out.println("****************");
		StringBuffer ins = new StringBuffer();
		ins.append("WELCOME");
		System.out.println(ins.length());
		ins.insert(7," BACK");
		System.out.println(ins);
		System.out.println(ins.length());
		ins.insert(12,"!");
		System.out.println(ins);
		
		System.out.println("****************");
		ins.delete(7,12);
		System.out.println(ins);
		
		System.out.println("****************");
		StringBuffer abc = new StringBuffer();
		abc.append("MEOME");
		System.out.println(abc);
		abc.deleteCharAt(2);
		System.out.println(abc);
		
		System.out.println("****************");
		String a = new String("ABC TECH");
		StringBuffer b = new StringBuffer("ABCDE COMPANY");
		System.out.println(a);
		System.out.println(b);
		String a1 = a.substring(4,8);
		String b1 = b.substring(4);
		String c1 = b.substring(6);
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		
		System.out.println("****************");
		StringBuffer ab = new StringBuffer("Able was i ere i saw ebla.");
		System.out.println(ab.length());
		System.out.println(ab.capacity());
		
		System.out.println("****************");
		StringBuffer hannah = new StringBuffer();
		hannah.append("Did Hannah see bees? Hannah did.");
		System.out.println(hannah);
		System.out.println(hannah.length());
		System.out.println(hannah.charAt(12));
		System.out.println(hannah.charAt(15));
		
		System.out.println("****************");
		StringBuffer sub= new StringBuffer("Was it a car or a cat I saw?");
		System.out.println(sub.substring(9, 12));
		
		//alternative way
		System.out.println("****************");
		System.out.println("Was it a car or a cat I saw?".substring(9, 12));
		
		System.out.println("****************");
		String original = "software";
		StringBuffer result = new StringBuffer("hi");
		int index = original.indexOf('a');
		result.setCharAt(0, original.charAt(0));
        result.setCharAt(1, original.charAt(original.length()-1));
		result.insert(1, original.charAt(4));
		result.append(original.substring(1,4));
        result.insert(3, (original.substring(index, index+2) + " "));
		System.out.println(result);
		
		System.out.println("****************");
		String hi = "Hi, ";
        String mom = "mom.";
        System.out.println(hi+mom);
        
        System.out.println("****************");
        Scanner app = new Scanner(System.in);
        String f = app.next();
        String l = app.next();
        System.out.println(l.charAt(0));
        
      
        
	}

}
