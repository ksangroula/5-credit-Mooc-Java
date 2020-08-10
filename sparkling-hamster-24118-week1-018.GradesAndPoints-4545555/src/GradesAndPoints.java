
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the points [0-60]: ");
        int x = Integer.parseInt(reader.nextLine());
        
        if (x <= 29){
            System.out.println("grade: failed");
        }
        else if (x >= 30 && x <= 34){
            System.out.println("grade: 1");
        }
        else if (x >= 35 && x <= 39){
            System.out.println("grade: 2");
        }
        else if (x >= 40 && x <= 44) {
            System.out.println("grade: 3");
        } 
        else if (x >= 45 && x <= 49) {
            System.out.println("grade: 4");
        }
        else if (x >= 50 && x <= 60){
            System.out.println("grade: 5");
        }   
    }
}
