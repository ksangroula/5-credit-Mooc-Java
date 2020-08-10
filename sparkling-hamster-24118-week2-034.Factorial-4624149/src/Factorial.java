import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        
        int i = 1;
        int number;
        int fact = 1;
        
        System.out.println(" Type a number: ");
        number = Integer.parseInt(reader.nextLine());
        
        
        
      while (i <= number ) {
          
          fact = fact * i;
          i++;
         System.out.println(fact); 
    }
}
}