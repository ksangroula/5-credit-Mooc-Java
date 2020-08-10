import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int tal;
        int sum = 0;
        double doubleSum = 0.0d;
        int numberTyped = 0;
        double doubleNumberTyped = 0.0d;
        double average = 0.0d;
        int even = 0;
        int odd = 0;
        
        System.out.println("Type numbers: ");
        
            
        
        while (true) {
            tal = Integer.parseInt(reader.nextLine());
            
            if (tal == -1) {
            System.out.println("Thank you and see you later!");
            System.out.println("The sum is " + sum);
            System.out.println("How many numbers: " + numberTyped);
            System.out.println("Average: " + average);
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);            
            break;
            }
            if (tal >= 0) {
               sum += tal;
               numberTyped++;
               doubleSum = (double) sum;
               doubleNumberTyped = (double) numberTyped;
               average = doubleSum / doubleNumberTyped;
               
            }
            if (tal > 0 && tal %2==0) {
                even++;
            }
            if (tal > 0 && tal %2!=0) {
                odd++;
    }
           
    }
            
            
    }
}

