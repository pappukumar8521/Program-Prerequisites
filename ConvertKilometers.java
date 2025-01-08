import java.util.*;
public class ConvertKilometers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enetr distance in kilometer");
        float Kilometers=sc.nextFloat();
        double Miles = Kilometers * 0.621371;
        System.out.println(" Convert Kilometers to Miles =" + Miles);
    }
}
