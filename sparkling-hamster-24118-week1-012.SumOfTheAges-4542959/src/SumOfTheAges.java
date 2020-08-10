
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

      System.out.println("Type your name: ");
        String name = reader.nextLine();
      System.out.println("Type your age: ");
        int Age1 = Integer.parseInt(reader.nextLine());
        
      System.out.println("Type your name: ");
        String name1 = reader.nextLine();
      System.out.println("Type your age: ");
        int Age2 = Integer.parseInt(reader.nextLine());
       
      int totalAge = Age1 + Age2;
      
      System.out.println(name + " and " + name1 + " are " + totalAge + "years old in total.");
        
    }
}
