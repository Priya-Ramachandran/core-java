package phase;

import java.util.Scanner;

public class strass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int c=0,d=0;
        for(int i=0;i<name.length();i++){
            if(Character.isDigit(name.charAt(i))){
               c+=1;
            }
            else{
                d+=1;
            }
        }
        if(c==name.length()){
            System.out.println("only digits");
        }
        else if(d==name.length()){
            System.out.println("only alphabets ");
        }
        else{
            System.out.println("Both digits and alphabets");
        }
    }
}