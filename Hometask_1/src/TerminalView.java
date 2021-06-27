import java.util.Scanner;

public class TerminalView {

    public String requestString(String requestedText) {
        System.out.println("Please input '" + requestedText + "' - ");

        Scanner sc = new Scanner(System.in);
        String result = "";
        while (true) {
            result = sc.nextLine();
            if (!result.equals(requestedText)) {
                System.out.println("This is not what we asked to input. Input '" + requestedText + "' !");
            } else {
                break;
            }
        }
        return result;
    }

    public void displayText (String text) {
        System.out.println(text);
    }
}