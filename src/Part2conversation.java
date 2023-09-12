//TODO Simple dialog with loop
import java.util.Scanner;
public class Part2conversation {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        char x = 'Y';
        while ( x =='Y' || x=='N') {
            System.out.println(" Write your line ");
            String write = Keyboard.nextLine();
            System.out.println("Do you wanna to continue ");
            System.out.println(write.toUpperCase());
            x = Keyboard.nextLine().charAt(0);
        }

    }
}



