import java.util.Scanner;
import java.util.Vector;

public class View {

    public static int user_try() {
        Scanner input_scanner = new Scanner(System.in);
        int user_input = -1;
        try {
            user_input = input_scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("Wrong input! Input whole number between 0 and 100!");
        }
        return user_input;
    }

    public static void show_message(String info_message) {
        System.out.print(info_message);
    }

    public static void show_attempts(Vector <Integer> attempt_array) {
        System.out.print(attempt_array);
    }
}
