
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int y = Integer.parseInt(reader.nextLine());
        int big;
        
        if (x>y){
            big = x;
        }
        else {
            big = y;
        }
        System.out.println("The bigger number of the two numbers given was: " + big);
    }
}
