import java.util.Scanner;

public class findvoworconst {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char character=sc.next().charAt(0);
        switch (character){
            case 'a':
                System.out.println(character+" IS A VOWEL...");
                break;
            case 'e':
                System.out.println(character+" IS A VOWEL....");
                break;
            case 'i':
                System.out.println(character+" IS A VOWEL.....");
                break;
            case 'o':
                System.out.println(character+" IS A VOWEL......");
                break;
            case 'u':
                System.out.println(character+" IS A VOWEL.......");
                break;
            default:
                System.out.println(character+"IS A CONSONANT.....");

        }
    }
}
