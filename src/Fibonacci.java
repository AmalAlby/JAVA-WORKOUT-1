import java.util.*;
class fib{
  int find_fibonacci(int num){
      if(num==0){
          return 0;
      }
      if(num==1 || num==2){
          return 1;
      }
      return find_fibonacci(num-2)+find_fibonacci(num-1);
  }
}

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int num=sc.nextInt();
        fib f1=new fib();
        for(int i=0;i<num;i++){
            int result=f1.find_fibonacci(i);
            if(result<=num){
              System.out.print(result+" ");
            }
            else{
              break;
            }
        }
    }
}
