import java.util.*;
public class temperature {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float fahrenheit=sc.nextFloat();

        /*Converting fahrenheit to celsius*/
        float celsius= (float) ((fahrenheit-32.0)*(5.0/9.0));

        System.out.println("THE TEMPERATURE IN FAHRENHEIT IS : "+fahrenheit);
        System.out.println("THE TEMPERATURE IN CELSIUS IS : "+celsius);
    }
}
