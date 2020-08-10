
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int first;
        int second;
        int sum = 0;
        
        System.out.println(" First: ");
        first = Integer.parseInt(reader.nextLine());
        
        System.out.println(" Second: ");
        second = Integer.parseInt(reader.nextLine());
        
      while (first <= second) {
          
          sum += first;
          first++;
         System.out.println(sum); 
      }
        
        
        
    }
}
