
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int i = 0;
        int sum = 0;
        
        
        System.out.println("Until what: ");
        int n = reader.nextInt();
        
        while (i <= n) {
            System.out.println(sum);
            i++;
            sum = sum + i;
            
        }

    }
}
