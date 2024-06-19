import java.util.*;

public class StringManip{
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String  :");
        String input=sc.nextLine();
        StringBuilder toggled=new StringBuilder(),caseString=new StringBuilder();

        for(String word :input.split(" ")){
            if(word.length()%2==0){
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<word.length();i+=2){
                    sb.append(word.charAt(i+1));
                    sb.append(word.charAt(i));
                }
                toggled.append(sb).append(" ");
            }   
        }

        for(char c :input.toCharArray()){
            caseString.append(Character.isUpperCase(c) ?Character.toLowerCase(c) :Character.toUpperCase(c));
        }

        System.out.println(toggled);
        System.out.println(caseString);

    }
}