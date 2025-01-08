import java.util.*;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enetr the length ");
        int length=sc.nextInt();
        System.out.println("Enetr the Width");
        int Width=sc.nextInt();
        int Rectangle=2*(length+Width);
        System.out.println( "Perimeter of a Rectangle = " + Rectangle );
    }
}
