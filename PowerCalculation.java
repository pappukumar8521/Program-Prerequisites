import java.util.*;
public class PowerCalculation {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Base");
    double  Base=sc.nextDouble();
    System.out.println("Enter the value of  exponent");
    double  Exponent = sc.nextDouble();
    double Power = Math.pow(Base, Exponent);
    System.out.println(" Power of  Calculation = " + Power);
}
    
}