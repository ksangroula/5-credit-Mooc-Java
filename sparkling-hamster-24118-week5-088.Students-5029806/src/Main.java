
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       ArrayList<Student> list = new ArrayList<Student>();
       String name;
       String studentNumber;
       
       System.out.print("name: ");
       name = reader.nextLine();
       
       while (!name.isEmpty()) {
           System.out.print("Student Number: ");
           studentNumber = reader.nextLine();
           list.add(new Student(name, studentNumber));
           System.out.print("name: ");
           name = reader.nextLine();
       }
       for (Student student : list) {
           System.out.println(student);
       }
       System.out.print("Give a search term: ");
       String searchTerm = reader.nextLine();
       System.out.println("Result:");
       for (Student student : list) {
           if (student.getName().contains(searchTerm)) {
               System.out.println(student);
           }
       }
    }
       
}
