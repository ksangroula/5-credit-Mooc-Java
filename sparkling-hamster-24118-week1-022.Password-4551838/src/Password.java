
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; 
        System.out.println("Type the password: ");
        password = reader.nextLine();

        while (!(password.equals("carrot"))) { 
            System.out.println("Wrong!");
            System.out.println("Type the password: ");
            password = reader.nextLine();            
                     
            } 
        System.out.println("Right");
        System.out.println("The secret is: You are awsome");
        
    
    }
}
        
        
         
        

       
        
        
    

