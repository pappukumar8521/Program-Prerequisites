import java.util.*;
public class AreaOfcircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enetr the Radius");
        double Radius=sc.nextDouble();
       double Area= Math.PI * Math.pow(Radius, 2);
        System.out.println("Area of Radius=" + Area);
    }
}
