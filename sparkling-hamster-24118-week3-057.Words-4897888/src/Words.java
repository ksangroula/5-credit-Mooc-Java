import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        System.out.println("Type a word: ");
        String inputString = reader.nextLine();
        
         while (!inputString.isEmpty()) {
            words.add(inputString);
            System.out.println("Type a word: ");
            inputString = reader.nextLine();
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
