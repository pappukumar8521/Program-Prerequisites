import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal");
        double Principl= sc.nextDouble();
        System.out.println("Enter the Rate");
        double Rate=sc.nextDouble();
        System.out.println("Enter the Time");
        double Time =sc.nextDouble();
        double  SimpleInterest= (Principl*Rate*Time)/100; 
        System.out.println(SimpleInterest);
    }
}
