import java.util.Scanner;

public class Part3improvedconversation {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        char x = 'Y';
        while (x == 'Y' || x == 'n') {
            System.out.println(" Write your line ");
            String write = Keyboard.nextLine();

            System.out.print("Reversed: ");
            for (int i = write.length() - 1; i >= 0; i--) {
                System.out.print(write.charAt(i));
            }

            System.out.print("Do you want to continue write Y or N ");
            x = Keyboard.nextLine().charAt(0);


        }


    }
}
