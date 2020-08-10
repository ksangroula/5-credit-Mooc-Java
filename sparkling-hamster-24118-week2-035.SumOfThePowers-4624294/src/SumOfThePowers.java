
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         
         int number = 2;
        int i = 0;
        int sum = 0;
        
        
        System.out.println(" Type a number: ");
        int p = Integer.parseInt(reader.nextLine());
        
       
        
      while (i <= p ) {
          
          sum = sum + (int)Math.pow(number, i);
          i = i + 1;
          System.out.println("The result is" + sum);
    }
}
}
