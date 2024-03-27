package phase;
import java.util.Arrays;


public class Anagram {
	public static void main(String[] args) {
		String p1 = new String("Parliament");
        String p2 = new String("Partial men,");
        p1=p1.toLowerCase();
    	p2=p2.toLowerCase();
    	p1= p1.replace(" ","");
    	p2 = p2.replace(" ","");
    	p1= p1.replaceAll("[^a-zA-Z0-9]","");
    	p2 = p2.replaceAll("[^a-zA-Z0-9]","");
    	char[] array1= p1.toCharArray();
    	char[] array2 = p2.toCharArray();
    	Arrays.sort(array1);
    	Arrays.sort(array2);
    	if(Arrays.equals(array1,array2)) {
    		System.out.println("Anagram");
    	}
    	else {
    		System.out.println("Not a anagram");
    	}
	}

}
