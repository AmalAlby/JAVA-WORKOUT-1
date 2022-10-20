import java.util.*;
public class NumberTriangle {
    public static void main(String[] args) {
       int i,j;
       Scanner sc=new Scanner(System.in);
       double n=sc.nextDouble();
       for(i=1;i<=n;i++){
           for(j=1;j<=i;j++){
               System.out.print(i);
           }
           System.out.print("\n");
       }
    }
}
