import java.util.*;
public class CalculateAverage {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Emter the value of A " );
    int  A =  sc.nextInt();
    System.out.println("Enter the value of B ");
    int B= sc.nextInt();
    System.out.println("Enter the value of C " );
    int C = sc.nextInt() ;
    float Average = (A+B+C)/3;
    System.out.println("Avarage of thre numbr is "+ Average );
  }  
}
