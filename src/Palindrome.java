import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER YOUR STRING: ");
        String str=sc.next();
        String reverse="";
        int len=str.length();

        /*Reversing a string */
        for(int i=len-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }

        /*Comparing two strings*/
        if(reverse.equals(str)){
            System.out.println("THE GIVEN STRING IS PALINDROME");
        }
        else{
            System.out.println("THE GIVEN STRING IS NOT PALINDROME");
        }
    }
}
