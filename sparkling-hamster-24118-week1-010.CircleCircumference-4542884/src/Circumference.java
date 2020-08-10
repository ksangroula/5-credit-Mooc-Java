
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

      System.out.println("Type the radius: ");
        int x = Integer.parseInt(reader.nextLine()); 
        
        double Circumference = 2 * Math.PI * x;
        System.out.println("Circumference of the circle: " + Circumference);
        
    }
}
