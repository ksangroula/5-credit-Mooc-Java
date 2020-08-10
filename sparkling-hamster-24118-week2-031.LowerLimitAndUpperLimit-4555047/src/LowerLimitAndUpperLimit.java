
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         
        System.out.println("First: ");
        int i = reader.nextInt();
        
        System.out.println("Second: ");
        int j = reader.nextInt();
        
        while (i <= j) {
            System.out.println(i);
            i++;
        }
    }

    }


