import  java.util.*;
class find_perfect_square{
    boolean fps(int n){
        double square_root=(int)Math.sqrt(n);
        if(square_root*square_root==n){
            return true;
        }
        else {
            return false;
        }
    }
}

public class PerfectSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBERS: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.print("THE PERFECT SQUARES BETWEEN THE GIVEN LIMIT ARE : ");
        find_perfect_square f1=new find_perfect_square();
        for(int i=num1;i<=num2;i++){
            boolean result=f1.fps(i);
            if(result==true){
                System.out.print(i+" ");
            }
        }
    }
}
