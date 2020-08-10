
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int j = 1;
        System.out.println("Up to what number?");
        int i = reader.nextInt();
        
        while (j <= i) {
            System.out.println(j);
            j++;
        }
    }
}
