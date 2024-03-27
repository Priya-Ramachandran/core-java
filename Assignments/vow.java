package phase;

import java.util.Scanner;
public class vow{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int vow=0,con=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == 'A'||name.charAt(i) == 'E'||name.charAt(i) == 'I'||
            name.charAt(i) == 'O'||name.charAt(i) == 'U'||name.charAt(i) == 'a'||
            name.charAt(i) == 'e'||name.charAt(i) == 'i'||name.charAt(i) == 'o'||name.charAt(i) == 'u'){
                vow+=1;
            }
            else{
                con+=1;
            }
        }
        System.out.println("Vowels : "+vow);
        System.out.println("Consonants : "+con);
        
    }
}