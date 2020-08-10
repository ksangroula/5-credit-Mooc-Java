
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

         System.out.println("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int y = Integer.parseInt(reader.nextLine());
        
        double Div = (double)x / y;
        System.out.println("Division:" + x + " / " + y + " = " + Div);
    }
}
