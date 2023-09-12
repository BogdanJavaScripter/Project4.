import java.sql.SQLOutput;
import java.util.Scanner;
public class Part4_1 {
    public static void main(String[] args) {
         {char x = 'Y';
             Scanner KeyBoard = new Scanner(System.in);



             do {
                 System.out.println("Hello if youre here, you might want advice.");
                 String YesOrNo;
                 System.out.println("Im a book guy and can recommend interesting books.");
                 System.out.println("Please enter your age: ");
                 int age = KeyBoard.nextInt();
                 KeyBoard.nextLine();

                 if (age <= 6) {
                     System.out.println("Book found:");
                     System.out.println("Trinity: The History of the Creation of the Nuclear Bomb.");
                 } else if (age >= 7 && age <= 13) {
                     System.out.println("Book found:");
                     System.out.println("Superstrings and the Search for the Theory of Everything, 1st Edition.");
                 } else if (age >= 14 && age <= 25) {
                     System.out.println("Book not found.");
                     System.out.println("You're at university, and you might not have much time to read. Goodbye!");
                 } else if (age >= 26 && age <= 50) {
                     System.out.println("Book found:");
                     System.out.println("That will be such a nice lesson for you: 'Atomic Habits'.");
                 } else {
                     System.out.println("You have already reached the state of bliss and genius.");
                     System.out.println("I will tell you some books after I beat my grandfather in chess.");
                 }

                 System.out.print("Do you want to continue Y or N ");
                 x = KeyBoard.nextLine().charAt(0);

             } while (x == 'Y' || x == 'n');


         }
    }

}

