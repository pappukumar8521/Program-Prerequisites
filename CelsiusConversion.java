import java.util.*;
public class CelsiusConversion {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enetr the temperature in Celsius");
    float Celsius = sc.nextFloat();
    float  Fahrenheit = (Celsius * 9/5) + 32;
    System.out.println("Fahrenheit = " + Fahrenheit);
}
    
}